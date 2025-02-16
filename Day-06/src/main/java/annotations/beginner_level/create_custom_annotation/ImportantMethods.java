package annotations.beginner_level.create_custom_annotation;
import java.lang.annotation.*;

// define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    //optional parameter default value as high
    String level() default "HIGH";
}

