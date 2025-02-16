package annotations.intermediate_level.create_annotation_for_logging;

public class ExecutionTime {
    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {
            //fast task
        }
        System.out.println("Fast method executed.");
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1_000_000; i++) {
            // slow task
        }
        System.out.println("Slow method executed.");
    }
}
