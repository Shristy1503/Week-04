package exceptionpropagation;

public class ExceptionPropagation {
    public static void main(String[] args) {
        // call method2 that will call method1
        method2();
    }
    // method1 performs division by zero which cause ArithmeticException
    public static void method1() {
        try {
            // this will throw ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
    // method2 calls method1 and propagates the exception
    public static void method2() {
        method1();
    }
}
