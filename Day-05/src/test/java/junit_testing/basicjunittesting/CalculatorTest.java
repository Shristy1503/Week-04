package junit_testing.basicjunittesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit_test.basicjunittest.testingcalculatorclass.*;
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(3, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-3, calculator.subtract(2, 5));
        assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(-12, calculator.multiply(-3, 4));
        assertEquals(0, calculator.multiply(10, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-5, calculator.divide(-10, 2));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
