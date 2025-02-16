package piped_streams;
import java.io.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
public class PipedStreamMain {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream); // Connect streams

            WriterThread writer = new WriterThread(outputStream);
            ReaderThread reader = new ReaderThread(inputStream);

            writer.start();
            reader.start();

            writer.join(); // Ensure threads complete before exiting
            reader.join();
        } catch (IOException | InterruptedException e) {
            System.err.println("Main: Exception occurred - " + e.getMessage());
        }
    }
}
