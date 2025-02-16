package reflection.advanced_level.dependency_injection;
import java.lang.reflect.Field;

class DIContainer {
    // Method to inject dependencies
    public static void injectDependencies(Object obj) {
        Class<?> objClass = obj.getClass();

        // Iterate through all fields
        for (Field field : objClass.getDeclaredFields()) {
            // Check if the field has @Inject annotation
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    // Get the field's type
                    Class<?> dependencyClass = field.getType();

                    // Create an instance of the dependency
                    Object dependencyInstance = dependencyClass.getDeclaredConstructor().newInstance();

                    // Make the field accessible and set the instance
                    field.setAccessible(true);
                    field.set(obj, dependencyInstance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

