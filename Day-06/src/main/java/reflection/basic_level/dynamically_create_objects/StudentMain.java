package reflection.basic_level.dynamically_create_objects;
import java.lang.reflect.Constructor;
public class StudentMain {
    public static void main(String[] args) {
        try {
            // Get the Class object 
            Class<?> studentClass = Class.forName("reflection.basic_level.dynamically_create_objects.Student");

            // Get the constructor
            Constructor<?> constructor = studentClass.getConstructor(int.class, String.class);

            // Create an instance
            Object studentObj = constructor.newInstance(101, "John Doe");

            // Call the display method
            studentClass.getMethod("display").invoke(studentObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
