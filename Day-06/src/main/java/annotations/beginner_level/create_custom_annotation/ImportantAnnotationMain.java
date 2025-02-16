package annotations.beginner_level.create_custom_annotation;
import java.lang.reflect.Method;
public class ImportantAnnotationMain {
    public static void main(String[] args) throws Exception {
        ImportantMethodAnnotation service = new ImportantMethodAnnotation();

        // Get all methods of TaskService
        Method[] methods = service.getClass().getDeclaredMethods();

        for (Method method : methods) {
            // Check if method has @ImportantMethod annotation
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName());
                System.out.println("Importance Level: " + annotation.level());
            }
        }

        // execute the methods
        service.processPayments();
        service.generateReport();
    }
}
