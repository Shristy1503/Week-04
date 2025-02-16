package annotations.intermediate_level.create_annotation_for_logging;
import java.lang.reflect.Method;
public class ExecutionTimeMain {
    public static void main(String[] args) throws Exception{
        ExecutionTime test = new ExecutionTime();
        // Get all methods
        Method[] methods = test.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                // Execute the method
                method.invoke(test);
                long endTime = System.nanoTime();

                System.out.println("Execution time of " + method.getName() + ": " + (endTime - startTime) / 1_000_000.0 + " ms");

            }
        }
    }
}
