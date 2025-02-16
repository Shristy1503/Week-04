package annotations.intermediate_level.create_maxlength_annotation;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// apply only to fields
@Target(ElementType.FIELD)
@interface MaxLength {
    // Parameter to specify max length
    int value();
}

