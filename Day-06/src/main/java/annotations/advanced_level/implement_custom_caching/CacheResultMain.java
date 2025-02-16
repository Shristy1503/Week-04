package annotations.advanced_level.implement_custom_caching;

public class CacheResultMain {
    public static void main(String[] args) {
        //create instance of class
        ApplyCacheResult computation = new ApplyCacheResult();

        System.out.println("First call: " + CacheHandler.invokeWithCache(computation, "factorial", 5));
        System.out.println("Second call (cached): " + CacheHandler.invokeWithCache(computation, "factorial", 5));
        System.out.println("New call: " + CacheHandler.invokeWithCache(computation, "factorial", 6));
    }
}
