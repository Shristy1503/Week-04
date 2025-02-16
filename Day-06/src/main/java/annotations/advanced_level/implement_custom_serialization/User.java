package annotations.advanced_level.implement_custom_serialization;

public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;
     //not annoted
    private int age;
    //constructor
    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
