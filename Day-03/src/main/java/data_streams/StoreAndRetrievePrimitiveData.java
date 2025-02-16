package data_streams;
import java.io.*;

public class StoreAndRetrievePrimitiveData {
    public static void main(String[] args) {
        //create instance of student
        Student student = new Student(101, "Shristy Mishra", 8.8);
        Student student2 = new Student(105, "Arjun Chauhan", 9.1);
        saveStudentData(student);
        saveStudentData(student2);
        loadStudentData();
    }
    //create a file student of dat
    private static final String fileName = "students.dat";
    //method to save changes in the file
    public static void saveStudentData(Student student) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());
            System.out.println("Student data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving student data: " + e.getMessage());
        }
    }
    //load the data in final file
    public static void loadStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Retrieved Student Data:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.err.println("Error loading student data: " + e.getMessage());
        }
    }
}
