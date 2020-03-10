package exerciseproblem.ch3.No14;

//Runnable 인스턴스의 배열을 받고, run 메서드에서 이 인스턴스들을 차례로 실행하는 Runnable을 반환 하는 메서드를 작성하라. 결과를 람다 표현식으로 반환한다.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Runnable> runnableArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i ++) {
            int finalI = i;
            runnableArrayList.add(() -> {
                for (int j = 0; j < 100; j++ ){
                System.out.println(finalI);
            }});
        }

        //ArrayList를 배열로 변경하는 것에 익숙해 지기 위해서 이렇게 연습 하였음.
        Runnable runnable = execute(runnableArrayList.stream().toArray(Runnable[] :: new));
        runnable.run();

    }

    public static Runnable execute(Runnable[] runs) {
        return () -> {
          for (int i = 0; i < runs.length; i++) {
              runs[i].run();
          }
        };
    }
}
