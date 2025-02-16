package reflection.advanced_level.custom_object_mapper;
import java.util.HashMap;
import java.util.Map;
public class ObjectMapperMain {
    public static void main(String[] args) {
        // Create a map with field values
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Shristy");
        properties.put("age", 22);
        properties.put("isStudent", true);
        properties.put("extraField", "This will be ignored");

        // Convert map to Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Print the result
        System.out.println(person);
    }
}
