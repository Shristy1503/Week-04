package annotations.exercise_problems.use_deprecated;

public class LegacyAPI {
    // Marking this method as deprecated
    @Deprecated(since = "1.0", forRemoval = true)
    void oldFeature() {
        System.out.println("This is an old feature and should not be used.");
    }

    // New recommended method
    void newFeature() {
        System.out.println("This is the new and improved feature.");
    }
}
