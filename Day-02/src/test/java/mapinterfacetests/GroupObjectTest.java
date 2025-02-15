package mapinterfacetests;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import mapinterface.groupobjectsbyproperty.*;
import java.util.*;
public class GroupObjectTest {
    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Arjun", "HR"),
                new Employee("Nancy", "IT" ),
                new Employee("David", "Finance")

        );

        Map<String, List<Employee>> result = GroupObjectsByProperty.groupByDepartment(employees);

        assertEquals(1, result.get("HR").size());
        assertTrue(result.get("HR").contains(new Employee("Arjun", "HR")));
        assertTrue(result.get("HR").contains(new Employee("Shristy", "HR")));

        assertEquals(1, result.get("IT").size());
        assertTrue(result.get("IT").contains(new Employee("Nancy", "IT")));

       // assertFalse(result.containsKey("Finance"));
    }

}
