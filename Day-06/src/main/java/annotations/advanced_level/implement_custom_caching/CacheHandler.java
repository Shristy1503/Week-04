package annotations.advanced_level.implement_custom_caching;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class CacheHandler {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeWithCache(Object obj, String methodName, Object... args) {
        try {
            Method method = obj.getClass().getMethod(methodName, int.class);
            // Check if method has @CacheResult
            if (method.isAnnotationPresent(CacheResult.class)) {
                String key = methodName + "_" + args[0];
                if (cache.containsKey(key)) {
                    System.out.println("Returning cached result for: " + args[0]);
                    return cache.get(key);
                }
                // compute result
                Object result = method.invoke(obj, args);
                // Store result in cache
                cache.put(key, result);
                return result;
            } else {
                return method.invoke(obj, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

