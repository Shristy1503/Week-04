package bytearray_stream;
import java.io.*;
public class ConvertImageToByteArray {
    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\SHRISTY MISHRA\\Downloads/input.jpg";   // input image file
        String outputImagePath = "C:\\Users\\SHRISTY MISHRA\\Downloads/output.jpg"; // output file after conversion

        try {
            // Convert Image to Byte Array
            byte[] imageBytes = imageToByteArray(inputImagePath);

            // Convert Byte Array back to Image
            byteArrayToImage(imageBytes, outputImagePath);

            System.out.println("Image conversion successful. Check output file: " + outputImagePath);
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
    // method to convert image file to byte array
    public static byte[] imageToByteArray(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }
    // method to convert byte array back to image file
    public static void byteArrayToImage(byte[] imageData, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
