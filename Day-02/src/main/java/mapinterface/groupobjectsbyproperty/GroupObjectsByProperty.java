package mapinterface.groupobjectsbyproperty;
import java.util.*;
import java.util.stream.Collectors;
public class GroupObjectsByProperty {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee employee : employees) {
            departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Arjun", "HR"),
                new Employee("Nancy", "IT"),
                new Employee("Shristy", "HR"),
                new Employee("David", "Finance")
        );
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
