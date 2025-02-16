package reflection.basic_level.dynamically_create_objects;
class Student {
    private int rollNumber;
    private String name;

    // Constructor
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
    }
}
