package exerciseproblem.ch3.No10;

public class Task implements Runnable {
    int n;
    String name;

    public Task(int n, String name) {
        this.n = n;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < n; i++) {
            System.out.println(this.name);
        }
    }
}
