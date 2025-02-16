package buffered_streams;
import java.io.*;
public class EfficientFileCopy {
    public static void main(String[] args) {
        String sourceFile = "src/sample.txt";  //file path
        String unbufferedCopy = "unbuffered_copy.txt";
        String bufferedCopy = "buffered_copy.txt";

        System.out.println("Starting File Copy Comparison...\n");

        // perform Unbuffered Copy
        copyFileUnbuffered(sourceFile, unbufferedCopy);

        // perform Buffered Copy
        copyFileBuffered(sourceFile, bufferedCopy);
    }

    private static final int BUFFER_SIZE = 4096; // 4 KB buffer

    // Method to copy file using unbuffered streams
    public static void copyFileUnbuffered(String sourcePath, String destPath) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

        } catch (IOException e) {
            System.err.println("IOException in unbuffered copy: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        System.out.println("Unbuffered Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // method to copy file using buffered streams
    public static void copyFileBuffered(String sourcePath, String destPath) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.err.println("IOException in buffered copy: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
