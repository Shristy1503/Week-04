package reflection.intermediate_level.access_andmodify_staticfield;
import java.lang.reflect.Field;
public class AccessModifyStaticField {
    public static void main(String[] args) {
        try {
            // Get the Class object for Configuration
            Class<?> configClass = Configuration.class;

            // Get the private static field "API_KEY"
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Make the field accessible
            apiKeyField.setAccessible(true);

            // Modify the static field value
            apiKeyField.set(null, "NEW_SECRET_KEY");

            // Retrieve and print the modified value
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
