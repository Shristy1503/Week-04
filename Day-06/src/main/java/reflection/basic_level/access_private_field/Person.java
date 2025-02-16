package reflection.basic_level.access_private_field;
class Person {
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Getter method (not used in reflection approach)
    public int getAge() {
        return age;
    }
}

