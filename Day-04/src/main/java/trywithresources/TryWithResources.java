package trywithresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        //path of file
      String fileName = "src/info.txt";
      //call method
      readFile(fileName);
    }
    public static void readFile(String fileName){
        // try with resources to automatically close BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                //check if first line null or empty
                System.out.println("First line of the file: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
            //handles the IOexception
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
