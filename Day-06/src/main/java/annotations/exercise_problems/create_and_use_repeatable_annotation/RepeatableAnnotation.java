package annotations.exercise_problems.create_and_use_repeatable_annotation;
import java.lang.annotation.*;

//define container annotation for multiple BugReports
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// define repeatable annotation @BugReport
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// allows multiple annotations
@Repeatable(BugReports.class)
@interface BugReport {
    //fields
    String description();
    String reportedBy();
}
