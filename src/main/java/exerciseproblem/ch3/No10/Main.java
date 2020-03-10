package exerciseproblem.ch3.No10;

import java.util.ArrayList;

/*
다음 메서드를 구현하라.
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)
첫 번째 메서드는 각 클래스를 별도의 스레드에서 실행한 후 반환해야 한다. 두 번째 메서드는 모든 태스크를 현재 스레드에서 실행하고 마지막의
태스크가 완료 될 때 반환해야 한다.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Runnable> arr = new ArrayList<>();
        for (int i = 0 ; i < 10; i ++) {
            arr.add(new Task(i,i+"테스크"));
        }
        runTogether(arr.stream().toArray(Runnable[] :: new));
        runInOrder(arr.stream().toArray(Runnable[] :: new));

    }

    public static void runTogether(Runnable... tasks) {
        for (int i = 0; i < tasks.length; i++) {
            new Thread(tasks[i]).start();
        }
    }
    public static void runInOrder(Runnable... tasks) {
        for (int i = 0; i < tasks.length; i++) {
            tasks[i].run();
        }
    }
}
