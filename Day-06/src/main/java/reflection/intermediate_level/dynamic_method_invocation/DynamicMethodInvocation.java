package reflection.intermediate_level.dynamic_method_invocation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();

            // Get the Class object
            Class<?> mathClass = mathOps.getClass();

            // Scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Ask user for method name
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            // Ask user for two numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get the method dynamically based on user input
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            int result = (int) method.invoke(mathOps, num1, num2);

            // Display result
            System.out.println("Result: " + result);

            // Close scanner
            scanner.close();
        } catch (NoSuchMethodException e) {
            System.out.println("Error: Invalid method name!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

