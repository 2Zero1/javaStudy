package exerciseproblem.ch2;

import com.sun.tools.javac.util.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

//RandomNumbers 클래스 안에 정적 메서드 randomElement를 두 개 구현하라. randomElement는 정수의 배열이나 배열리스트에서 임의의 요소를 얻는다.
//(해당 배열이나 배열 리스트가 비어있으면 0을 반환한다.) 이 메서드들은 int[]나 ArrayList<Integer>의 인스턴스 메서드로 만들 수 없는 이유는 ?
//이유는 이미 표준 라이브러리들은 메서드를 추가할 수 없기 때문이다.
public class No10 {

    public static void main(String[] args) {
        Random gen = new Random();
        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"A","B","C","D"};

        ArrayList<String> arrayList = new ArrayList<>(List.of("A","B","C","D"));
        System.out.println(RandomNumbers.randomElement(gen,arr1));
        System.out.println(RandomNumbers.randomElement(gen,arrayList));

    }

}

class RandomNumbers {
    public static int nextInt(Random generator, int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static <T> T randomElement(Random generator, T[] array) {
        int i = nextInt(generator, 0, array.length-1);
        return array[i];
    }
    public static <T> T randomElement(Random generator, ArrayList<T> array) {
        int i = nextInt(generator, 0, array.size()-1);
        return array.get(i);
    }
}
