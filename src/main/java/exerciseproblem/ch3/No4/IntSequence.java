package exerciseproblem.ch3.No4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*익명을 사용하지 않음
- array를 stream으로 만들어 맵으로 하나씩 sequence로 변경.
- 배열을 ArrayList<Sequence>로 만든 후 Sequence[] 형태로 변환하였음.
 */
interface IntSequence {
    static IntSequence[] of(int... ints) {
//        Integer[] arr = new Integer[ints.length];
//        for (int i = 0; i < arr.length; i ++) {
//            arr[i] = Integer.valueOf(ints[i]);
//        }
//        List<Integer> names = List.of(arr);
//        Stream<Sequence> stream = names.stream().map(Sequence::new);
//
//
//        return stream.toArray(Sequence[]::new);

        ArrayList<Sequence> arr = new ArrayList<>();
        for(int item : ints) {
            arr.add(new Sequence(item));
        }
        return arr.stream().toArray(Sequence[] :: new);
    }
}
