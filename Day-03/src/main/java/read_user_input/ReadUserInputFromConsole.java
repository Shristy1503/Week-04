package read_user_input;
import java.io.*;
public class ReadUserInputFromConsole {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "src/sample3.txt";
        //try block to add detail in the file
        try (FileWriter writer = new FileWriter(fileName, true)) {
            System.out.print("enter name: ");
            String name = reader.readLine(); //read the name

            System.out.print("enter age: ");
            int age = Integer.parseInt(reader.readLine()); //read age

            System.out.print("enter your favorite programming language: ");
            String language = reader.readLine(); //read the language

            //to write changes int the file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("Information saved in " + fileName);
        } catch (IOException e) { //catch the exception of reading or writing in file
            System.err.println("An error occurred while reading input or writing to file: " + e.getMessage());
        } catch (NumberFormatException e) { //exception in arithemetic age
            System.err.println("Invalid age input. Please enter a valid number.");
        }
    }
}
