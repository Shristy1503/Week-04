package read_a_large_file_line_by_line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "src/source.txt";  //file path set

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) { //read file line by line
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            } //catch exception of io operation
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
}
