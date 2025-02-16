package annotations.advanced_level.implement_custom_caching;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// Can be applied to methods
@Target(ElementType.METHOD)
@interface CacheResult {
}

