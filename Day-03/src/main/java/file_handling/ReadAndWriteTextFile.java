package file_handling;
import java.io.*;
public class ReadAndWriteTextFile {
    public static void main(String[] args) {
        // create source file
        String sourceFile = "src/source.txt";
        //create destination file
        String destinationFile = "src/destination.txt";

        FileInputStream fileSource = null;
        FileOutputStream fileDestination = null;
         //try block the code might throw exception
        try {
            // source file for reading
            fileSource = new FileInputStream(sourceFile);
            // destination file for writing
            fileDestination = new FileOutputStream(destinationFile);

            int byteData;
            //read data byte-by-byte
            while ((byteData = fileSource.read()) != -1) {
                // write in destination file
                fileDestination.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            System.out.println("Error: Unable to read/write file!");
        } finally {
            try {
                if (fileSource != null) fileSource.close(); // close file input stream
                if (fileDestination != null) fileDestination.close(); // close file output stream
            } catch (IOException e) {
                System.out.println("Error: Failed to close the files properly.");
            }
        }
    }
}
