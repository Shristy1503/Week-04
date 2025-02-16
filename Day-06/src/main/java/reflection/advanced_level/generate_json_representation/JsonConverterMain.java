package reflection.advanced_level.generate_json_representation;

public class JsonConverterMain {
    public static void main(String[] args) {
        // Create a sample object
        Person person = new Person("Shristy", 22, true);

        // Convert object to JSON-like string
        String jsonString = JsonConverter.toJson(person);

        // Print JSON representation
        System.out.println(jsonString);
    }
}
