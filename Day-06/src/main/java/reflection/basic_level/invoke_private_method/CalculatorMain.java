package reflection.basic_level.invoke_private_method;
import java.lang.reflect.Method;
public class CalculatorMain {
    public static void main(String[] args) {
        try {
            // Create an instance of class
            Calculator calculator = new Calculator();

            // Get the Class object
            Class<?> calculatorClass = calculator.getClass();

            // Get the private method
            Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);

            // Make the method accessible
            multiplyMethod.setAccessible(true);

            // Invoke the private method
            int result = (int) multiplyMethod.invoke(calculator, 5, 7);

            // Display the result
            System.out.println("Multiplication Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
