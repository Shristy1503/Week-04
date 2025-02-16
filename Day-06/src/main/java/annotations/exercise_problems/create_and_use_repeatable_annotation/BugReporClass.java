package annotations.exercise_problems.create_and_use_repeatable_annotation;

public class BugReporClass {
    @BugReport(description = "NullPointerException when input is null", reportedBy = "Shristy")
    @BugReport(description = "Incorrect output when input is negative", reportedBy = "Arjun")
    public void processData() {
        System.out.println("Processing data...");
    }
}
