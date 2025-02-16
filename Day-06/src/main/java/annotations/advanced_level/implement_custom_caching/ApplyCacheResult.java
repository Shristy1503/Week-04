package annotations.advanced_level.implement_custom_caching;

public class ApplyCacheResult {
    @CacheResult
    public int factorial(int n) {
        System.out.println("Computing factorial of " + n);
        if (n == 0 || n == 1) return 1;
        // recursively compute factorial
        return n * factorial(n - 1);
    }
}
