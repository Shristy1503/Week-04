package piped_streams;
import java.io.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
public class ReaderThread extends Thread{
    private PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            System.out.print("ReaderThread: Reading message - ");
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\nReaderThread: Message read successfully.");
            inputStream.close(); // Close stream after reading
        } catch (IOException e) {
            System.err.println("ReaderThread: IOException occurred - " + e.getMessage());
        }
    }

}
