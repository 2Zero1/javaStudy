package exercise.Ch3;

public class HelloTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i ++) {
            System.out.println("Hello, World");
        }
    }
}
