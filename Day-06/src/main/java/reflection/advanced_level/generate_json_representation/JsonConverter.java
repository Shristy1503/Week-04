package reflection.advanced_level.generate_json_representation;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder json = new StringBuilder("{");
        Class<?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); // Allow access to private fields

            try {
                String fieldName = field.getName();
                Object fieldValue = field.get(obj);
                json.append("\"").append(fieldName).append("\": ");

                // Format values properly
                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

                // Add a comma if not the last field
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}
