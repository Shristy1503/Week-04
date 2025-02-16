package filter_streams;
import java.io.*;
public class ConvertUppercaseToLowerCase {
    public static void main(String[] args) {
        String inputFile = "src/source.txt"; //create source file
        String outputFile = "src/destination.txt";  //create destination file
        //try block
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
          //write in the destination file
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            System.out.println("Conversion completed in " + outputFile);
        } catch (IOException e) { //catch block to handle input output exception
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
