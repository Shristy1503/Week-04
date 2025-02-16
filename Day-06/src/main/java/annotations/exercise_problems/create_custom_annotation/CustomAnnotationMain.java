package annotations.exercise_problems.create_custom_annotation;
import java.lang.reflect.Method;

public class CustomAnnotationMain {
    public static void main(String[] args) {
        try {
            // get class object
            Class<TaskManager> obj = TaskManager.class;

            for (Method method : obj.getDeclaredMethods()) {
                // Check if @TaskInfo annotation is present
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    TaskInfo task = method.getAnnotation(TaskInfo.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + task.priority());
                    System.out.println("Assigned To: " + task.assignedTo());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
