package annotations.exercise_problems.use_deprecated;

public class DeprecatedMain {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        // Calling the deprecated method
        api.oldFeature();

        // Calling the new recommended method
        api.newFeature();
    }
}
