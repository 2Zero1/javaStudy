package exercise.Ch3;

public class Application {
    public void doWork() {
        Runnable runner = () -> { System.out.println(this.toString());};
        runner.run();
    }
}
