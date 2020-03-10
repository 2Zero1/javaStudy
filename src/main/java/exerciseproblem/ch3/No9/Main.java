package exerciseproblem.ch3.No9;

/*
Runnable을 구현하는 Greeter 클래스를 작성하라. 이 클래스의 run 메서드는 "Hello, " + target을 n번 출력해야 한다. n과 target은
생성자에서 설정한다. 각기 다른 메시지로 인스턴스를 두 개 생성해서 두 스레드에 동시에 실행하라.
 */
public class Main {
    public static void main(String[] args) {
        Greeter greeter1 = new Greeter(100, "first");
        Greeter greeter2 = new Greeter(200, "second");
        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);
        thread1.start();
        thread2.start();
    }
}
