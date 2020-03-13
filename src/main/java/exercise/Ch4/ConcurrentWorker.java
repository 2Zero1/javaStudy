package exercise.Ch4;
/*
super를 이용한 메서드 표현식
관련 클래스 : Worker
 */
public class ConcurrentWorker extends Worker {
    public void work() {
        Thread t = new Thread(super::work);
        t.start();

    }
}
