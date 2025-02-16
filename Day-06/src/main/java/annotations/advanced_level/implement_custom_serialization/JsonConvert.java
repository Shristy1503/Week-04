package annotations.advanced_level.implement_custom_serialization;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
public class JsonConvert {
    public static String serialize(Object obj) {
        Map<String, String> jsonMap = new HashMap<>();
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                // Check for @JsonField
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);
                    // Get custom JSON key
                    String jsonKey = field.getAnnotation(JsonField.class).name();
                    Object value = field.get(obj); // Get field value
                    jsonMap.put(jsonKey, value.toString());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // Convert to JSON-like format
        return jsonMap.toString().replace("=", ": ");
    }
}
