package reflection.advanced_level.method_execution_timing;
class Task {
    // creating fast method
    public void fastMethod() {
        System.out.println("Executing fastMethod...");
    }

    // creating slow method
    public void slowMethod() {
        System.out.println("Executing slowMethod...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

