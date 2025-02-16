package annotations.beginner_level.create_todo_annotation;
import java.lang.annotation.*;

//availabel at runtime
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo{
    //describe the task
    String task();
    //assign the task
    String assignedTo();
    //set priority
    String priority() default "MEDIUM";
}
