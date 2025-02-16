package annotations.exercise_problems.create_custom_annotation;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Shristy Mishra")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }
}
