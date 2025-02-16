package annotations.advanced_level.implement_rolebased_accesscontrol;

public class User {
    private String role;
    //constructor
    public User(String role) {
        this.role = role;
    }
   //getter method
    public String getRole() {
        return role;
    }
}
