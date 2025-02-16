package reflection.basic_level.get_class_information;
import java.lang.reflect.*;

public class ClassInfo {
    public static void displayClassDetails(String className) {
        try {
            // load class
            Class<?> cls = Class.forName(className);

            // display class name
            System.out.println("Class Name: " + cls.getName());

            // show constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // show fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            // show methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}

