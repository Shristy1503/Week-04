package annotations.advanced_level.implement_rolebased_accesscontrol;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// Can be applied to methods
@Target(ElementType.METHOD)
@interface RoleAllowed {
    // role required to access the method
    String value();
}

