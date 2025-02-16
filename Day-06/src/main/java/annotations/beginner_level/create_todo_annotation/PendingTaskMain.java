package annotations.beginner_level.create_todo_annotation;
import java.lang.reflect.Method;
public class PendingTaskMain {
    public static void main(String[] args) {
        //create instance of class
        PendingTask task = new PendingTask();
        //it retrieve all class and methods of class
        Method[] method = task.getClass().getDeclaredMethods();

        System.out.println("pending tasks: ");
        for (Method method1 : method){
            if(method1.isAnnotationPresent(Todo.class)){
               Todo todo = method1.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned to: " + todo.assignedTo());
                System.out.println("priority: " + todo.priority());
                System.out.println("Method name: " + method1.getName());
            }
        }
    }
}
