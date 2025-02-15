package queueinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import queueinterface.circularbuffersimulation.*;
import java.util.Arrays;
public class CircularBufferTest {
    private CircularBufferSimulation cb;

    @BeforeEach
    void setUp() {
        cb = new CircularBufferSimulation(3);
    }

    @Test
    void testInsertionAndRetrieval() {
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        assertArrayEquals(new int[]{1, 2, 3}, cb.getBuffer());
    }

    @Test
    void testOverwriteWhenFull() {
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        assertArrayEquals(new int[]{2, 3, 4}, cb.getBuffer());
    }


}
