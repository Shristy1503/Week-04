package reflection.basic_level.get_class_information;
import java.util.Scanner;
public class ClassInfoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fully qualified class name: ");
        String className = scanner.nextLine();

        // call reflection class to display details
        ClassInfo.displayClassDetails(className);
    }
}
