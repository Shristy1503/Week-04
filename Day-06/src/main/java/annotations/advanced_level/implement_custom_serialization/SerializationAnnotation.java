package annotations.advanced_level.implement_custom_serialization;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// Can be applied to fields
@Target(ElementType.FIELD)
@interface JsonField {
    // custom  name
    String name();
}
