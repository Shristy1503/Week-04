package data_streams;
import java.io.*;
public class Student {
    private int rollNumber;
    private String name;
    private double gpa;
    //constructor
    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }
    //getter methods
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}
