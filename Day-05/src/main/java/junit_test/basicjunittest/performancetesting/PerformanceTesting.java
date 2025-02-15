package junit_test.basicjunittest.performancetesting;

public class PerformanceTesting {
    public String longRunningTask() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }

}
