package annotations.exercise_problems.create_custom_annotation;
import java.lang.annotation.*;

// define custom annotation @TaskInfo
// Available at runtime
@Retention(RetentionPolicy.RUNTIME)

@Target(ElementType.METHOD)
@interface TaskInfo {
    //fields
    String priority();
    String assignedTo();
}
