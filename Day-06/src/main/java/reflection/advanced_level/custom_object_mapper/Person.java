package reflection.advanced_level.custom_object_mapper;
class Person {
    private String name;
    private int age;
    private boolean isStudent;

    public Person() {
        // Default constructor
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", isStudent=" + isStudent + "}";
    }
}
