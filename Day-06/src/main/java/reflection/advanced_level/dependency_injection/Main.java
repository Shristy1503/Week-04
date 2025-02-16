package reflection.advanced_level.dependency_injection;

public class Main {
    public static void main(String[] args) {
        // Create an instance of UserService
        UserService userService = new UserService();

        // Inject dependencies dynamically
        DIContainer.injectDependencies(userService);

        // Use the injected services
        userService.processUser();
    }
}
