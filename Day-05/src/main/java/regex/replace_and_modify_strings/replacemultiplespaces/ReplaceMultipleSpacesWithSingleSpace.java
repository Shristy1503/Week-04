package regex.replace_and_modify_strings.replacemultiplespaces;
import java.util.Scanner;
public class ReplaceMultipleSpacesWithSingleSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking user input
        System.out.println("Enter a string with multiple spaces:");
        String userInput = scanner.nextLine();

        // calling method and displaying result
        String result = removeMultipleSpaces(userInput);
        System.out.println("Processed String: " + result);

    }
    // Method to replace multiple spaces with a single space
    public static String removeMultipleSpaces(String input) {
        return input.replaceAll("\\s+", " ");
    }
}
