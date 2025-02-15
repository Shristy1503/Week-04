package mapinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import mapinterface.wordfrequencycounter.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class FrequencyCounterTest {
    @Test
    void testWordFrequencyCounter() throws IOException {
        File tempFile = File.createTempFile("test", ".txt");
        tempFile.deleteOnExit();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello world, hello java!");
            writer.newLine();
            writer.write("Java is fun. Java is powerful.");
        }

        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        expected.put("java", 3);
        expected.put("is", 2);
        expected.put("fun", 1);
        expected.put("powerful", 1);

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(tempFile.getAbsolutePath());

        assertEquals(expected, result);
    }

}
