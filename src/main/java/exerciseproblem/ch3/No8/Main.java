package exerciseproblem.ch3.No8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*비교자로 판별했을 때 요소들이 오름차순으로 정렬될 때까지 배열 리스트를 대상으로 Collection.shuffle을 계속 호출하는
void luckSort(ArrayList<String> strings, Comparator<String> com) 메서드를 구현하라.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("z");
        arr.add("b");
        arr.add("i");
        arr.add("ca");
        arr.add("ab");
        arr.add("az");
        arr.add("cf");
        arr.add("az");

        luckySort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        arr.forEach(System.out::println);
//        luckySort(arr, new StringComparator());
    }
    public static void luckySort(ArrayList<String> strings, Comparator<String> com) {

        ArrayList<String> target = new ArrayList<>(strings);
        Collections.sort(target, com);

        outer :
        while(true){
            Collections.shuffle(strings);
            for(int i = 0; i < strings.size(); i++) {
                if (strings.get(i) != target.get(i)) {
                    continue outer;
                }
            }
            return ;
        }

    }
}
