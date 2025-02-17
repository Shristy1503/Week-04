package checkedexception;
import java.io.*;
public class CheckedException {
    public static void main(String[] args) {
      //call method
        checkedException("src/sample.txt"); // file path
    }
    public static void checkedException(String fileName){
        File file = new File(fileName);
        if(!file.exists()){
            System.out.println("File not found "); //file not found error
            return;
        }
        //code inside try block to read the file
       try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.lines().forEach(System.out::println);
        }catch (IOException e){
            //print message of error
            System.out.println("An error occurred in file reading " + e.getMessage());
       }
    }
}
