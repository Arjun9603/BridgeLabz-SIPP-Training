package JUnit;

public class TaskRunner {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // simulate long task
        return "done";
    }
}
