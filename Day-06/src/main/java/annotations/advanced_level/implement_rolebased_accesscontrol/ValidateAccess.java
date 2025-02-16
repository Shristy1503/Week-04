package annotations.advanced_level.implement_rolebased_accesscontrol;
import java.lang.reflect.Method;
public class ValidateAccess {
    // 0nly "ADMIN" users can access
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed!");
    }

    public void userTask() {
        System.out.println("User task executed!");
    }

    public static void invokeMethodIfAllowed(User user, String methodName) {
        try {
            // Get the method
            Method method = ValidateAccess.class.getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if (!user.getRole().equals(requiredRole)) {
                    System.out.println("Access Denied! You must be an " + requiredRole);
                    return;
                }
            }
            // invoke method if allowed
            method.invoke(new ValidateAccess());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
