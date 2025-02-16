package piped_streams;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
public class WriterThread extends Thread{
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            outputStream.write(message.getBytes());
            System.out.println("WriterThread: Message written to pipe.");
            outputStream.close(); // Close stream after writing
        } catch (IOException e) {
            System.err.println("WriterThread: IOException occurred - " + e.getMessage());
        }
    }
}
