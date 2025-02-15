package queueinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import queueinterface.generatebinarynumbersusingqueue.*;
import java.util.List;
import java.util.Arrays;

public class GenerateBinaryNumberTest {
    @Test
    void testGenerateBinaryNumbersForSmallN() {
        List<String> expected = Arrays.asList("1", "10", "11", "100", "101");
        assertEquals(expected, GenerateBinaryNumbers.generateBinaryNumbers(5));
    }

    @Test
    void testGenerateBinaryNumbersForN1() {
        List<String> expected = Arrays.asList("1");
        assertEquals(expected, GenerateBinaryNumbers.generateBinaryNumbers(1));
    }

    @Test
    void testGenerateBinaryNumbersForN10() {
        List<String> expected = Arrays.asList("1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010");
        assertEquals(expected, GenerateBinaryNumbers.generateBinaryNumbers(10));
    }

    @Test
    void testGenerateBinaryNumbersForZero() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, GenerateBinaryNumbers.generateBinaryNumbers(0));
    }

}
