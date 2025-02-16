package annotations.exercise_problems.create_and_use_repeatable_annotation;
import java.lang.reflect.Method;
public class RepeatableAnnotationMain {
    public static void main(String[] args) {
        try {
            // to get the class object
            Class<BugReporClass> obj = BugReporClass.class;

            // Loop through declared methods
            for (Method method : obj.getDeclaredMethods()) {
                // Check if @BugReport is present
                if (method.isAnnotationPresent(BugReports.class)) {
                    BugReports bugReports = method.getAnnotation(BugReports.class);

                    System.out.println("Method: " + method.getName());
                    for (BugReport bug : bugReports.value()) {
                        System.out.println("Bug Description: " + bug.description());
                        System.out.println("Reported By: " + bug.reportedBy());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
