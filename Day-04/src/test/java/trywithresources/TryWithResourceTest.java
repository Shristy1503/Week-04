package trywithresources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import trywithresources.TryWithResources;
public class TryWithResourceTest {
    @Test
    public void testFileDoesNotExist() {
        IOException exception = assertThrows(IOException.class, () -> {
            TryWithResources.readFile("nonexistentfile.txt");
        });
        assertEquals(" nonexistentfile.txt (The system cannot find the file specified)", exception.getMessage());
    }
}
