package reflection.advanced_level.dependency_injection;

class UserService {
    @Inject
    private DependencyInjection databaseService;

    @Inject
    private NotificationService notificationService;

    // Method to use injected dependencies
    public void processUser() {
        databaseService.connect();
        notificationService.sendNotification();
    }
}

