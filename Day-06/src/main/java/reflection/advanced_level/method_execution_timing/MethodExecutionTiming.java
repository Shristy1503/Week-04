package reflection.advanced_level.method_execution_timing;
import java.lang.reflect.Method;
public class MethodExecutionTiming {
    public static void main(String[] args) {
        try {
            // create instance of Task
            Task task = new Task();

            // get class object
            Class<?> taskClass = task.getClass();

            String[] methodNames = {"fastMethod", "slowMethod"};

            for (String methodName : methodNames) {
                // get method dynamically
                Method method = taskClass.getMethod(methodName);

                // measure execution time
                long startTime = System.nanoTime();
                method.invoke(task);
                long endTime = System.nanoTime();

                // calculate and print execution time in milliseconds
                long duration = (endTime - startTime) / 1_000_000;
                System.out.println(methodName + " execution time: " + duration + " ms");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
