package queueinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import queueinterface.hospitaltriagesystem.*;
import java.util.PriorityQueue;

public class HospitalTriageTest {
    private PriorityQueue<Patient> queue;

    @BeforeEach
    void setUp() {
        queue = new PriorityQueue<>();
        queue.add(new Patient("Shristy", 3));
        queue.add(new Patient("Nancy", 5));
        queue.add(new Patient("Arjun", 2));
    }

    @Test
    void testPatientOrder() {
        assertEquals("Nancy (Severity: 5)", queue.poll().toString());
        assertEquals("Shristy (Severity: 3)", queue.poll().toString());
        assertEquals("Arjun (Severity: 2)", queue.poll().toString());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testEmptyQueueBehavior() {
        queue.poll();
        queue.poll();
        queue.poll();
        assertNull(queue.poll());
    }

    @Test
    void testAddingNewPatients() {
        queue.add(new Patient("Tata", 4));
        queue.add(new Patient("Meer", 1));

        assertEquals("Nancy (Severity: 5)", queue.poll().toString());
        assertEquals("Tata (Severity: 4)", queue.poll().toString());
        assertEquals("Shristy (Severity: 3)", queue.poll().toString());
        assertEquals("Arjun (Severity: 2)", queue.poll().toString());
        assertEquals("Meer (Severity: 1)", queue.poll().toString());
    }

}
