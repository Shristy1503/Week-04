package serialization;
import java.io.*;
import java.util.*;
public class SaveAndRetrieveAnObject {
    private static final String fileName = "employees.dat"; //create file of student type

    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving employees: " + e.getMessage());
        }
    }
     //method to load employees
    public static List<Employee> loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading employees: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        //create the list and add employees in it
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Arjun", "HR", 50000));
        employees.add(new Employee(2, "Shristy", "IT", 60000));
        employees.add(new Employee(3, "Tata", "Finance", 70000));
        //call method
        saveEmployees(employees);
        //list creation and display
        List<Employee> loadedEmployees = loadEmployees();
        System.out.println("Loaded Employees:");
        for (Employee emp : loadedEmployees) {
            System.out.println(emp);
        }
    }
}
