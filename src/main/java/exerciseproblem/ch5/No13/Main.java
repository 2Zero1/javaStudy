package exerciseproblem.ch5.No13;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
int min(int[] values)메서드를 작성하라. 이 메서드는 가장 작은 값을 반환하기에 앞서 해당 값이 실제로 배열에 들어 있는 모든 값보다 작거나 같음(<=)을
단정 해야한다. 비공개 헬퍼 메서드를 사용하거나 8장 스트림의 내용을 미리 훑어보았다면 Stream.allMatch를 사용하라. 단저 활성화, 비활성화하고 제거한 상태에서
큰 배열을 인수로 전달해 해당 메서드를 반복해서 호출한 후 실행 시간을 측정하라.

 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        for (int i = 0 ; i < 10000000; i ++) {
            arr [i] = i;
        }
        System.out.println(min(arr));
    }
    private static int min(int[] values) {
       long start =  System.currentTimeMillis();
        int a = 1000000000;
        for (int i = 0; i < values.length; i++) {
            if (a > i){
                a = i;
            }
        }
        for (int i = 1; i < values.length; i++) {
            assert a <= i;
        }
       long end =  System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(end);
        System.out.println(start);
        return a;
    }
}
