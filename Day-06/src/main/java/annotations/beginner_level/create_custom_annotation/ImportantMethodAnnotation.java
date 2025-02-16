package annotations.beginner_level.create_custom_annotation;

public class ImportantMethodAnnotation {
    @ImportantMethod(level = "CRITICAL") // Marking as critical
    public void processPayments() {
        System.out.println("Processing payments...");
    }

    @ImportantMethod // Default level is "HIGH"
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void normalMethod() {
        System.out.println("This is a normal method.");
    }
}
