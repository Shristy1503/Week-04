package reflection.basic_level.access_private_field;
import java.lang.reflect.Field;
public class ModifyPrivateFields {
    public static void main(String[] args) {
        try {
            // Create an instance of Person with age 25
            Person person = new Person(25);

            // Get the Class object
            Class<?> personClass = person.getClass();

            // Get the private field "age"
            Field ageField = personClass.getDeclaredField("age");

            // Make the field accessible
            ageField.setAccessible(true);

            // Retrieve and print the current age value
            System.out.println("Original Age: " + ageField.getInt(person));

            // Modify the private field value
            ageField.setInt(person, 30);

            // Retrieve and print the modified age value
            System.out.println("Modified Age: " + ageField.getInt(person));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
