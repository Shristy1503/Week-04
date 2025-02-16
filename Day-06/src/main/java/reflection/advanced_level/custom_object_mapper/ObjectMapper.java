package reflection.advanced_level.custom_object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create an instance using the default constructor
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate over the properties map
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    // Get the field in the class
                    Field field = clazz.getDeclaredField(fieldName);

                    // Make the field accessible if private
                    field.setAccessible(true);

                    // Convert types (if necessary)
                    Object convertedValue = convertValue(field.getType(), fieldValue);

                    // Set the field value
                    field.set(obj, convertedValue);
                } catch (NoSuchFieldException e) {
                    // Ignore fields not present in the class
                    System.out.println("Warning: Field '" + fieldName + "' not found in " + clazz.getSimpleName());
                }
            }

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Type conversion helper (handles primitive type conversions)
    private static Object convertValue(Class<?> targetType, Object value) {
        if (value == null) return null;

        if (targetType.isAssignableFrom(value.getClass())) {
            return value; // No conversion needed
        }

        if (targetType == int.class || targetType == Integer.class) {
            return Integer.parseInt(value.toString());
        } else if (targetType == boolean.class || targetType == Boolean.class) {
            return Boolean.parseBoolean(value.toString());
        } else if (targetType == double.class || targetType == Double.class) {
            return Double.parseDouble(value.toString());
        } else if (targetType == long.class || targetType == Long.class) {
            return Long.parseLong(value.toString());
        } else if (targetType == String.class) {
            return value.toString();
        }

        throw new IllegalArgumentException("Unsupported type: " + targetType);
    }
}
