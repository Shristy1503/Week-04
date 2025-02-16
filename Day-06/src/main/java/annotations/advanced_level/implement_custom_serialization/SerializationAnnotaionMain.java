package annotations.advanced_level.implement_custom_serialization;

public class SerializationAnnotaionMain {
    public static void main(String[] args) {
        //create instance of class
        User user = new User("ShristyMishra", "shristy@example.com", 22);
        String jsonString = JsonConvert.serialize(user);
        System.out.println(jsonString);
    }
}
