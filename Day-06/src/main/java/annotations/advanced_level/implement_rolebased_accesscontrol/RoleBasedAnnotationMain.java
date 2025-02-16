package annotations.advanced_level.implement_rolebased_accesscontrol;

public class RoleBasedAnnotationMain {
    public static void main(String[] args) {
        User adminUser = new User("ADMIN");
        User normalUser = new User("USER");

        System.out.println("Admin trying to execute adminTask:");
        //will be allowed
       ValidateAccess.invokeMethodIfAllowed(adminUser, "adminTask");
       //will not be allowed
        System.out.println("\nUser trying to execute adminTask:");
        ValidateAccess.invokeMethodIfAllowed(normalUser, "adminTask");

        System.out.println("\nUser trying to execute userTask:");
        ValidateAccess.invokeMethodIfAllowed(normalUser, "userTask");

    }
}
