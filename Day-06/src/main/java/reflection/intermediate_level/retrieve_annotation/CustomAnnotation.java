package reflection.intermediate_level.retrieve_annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    //field
    String name();
}
