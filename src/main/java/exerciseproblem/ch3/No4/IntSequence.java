package exerciseproblem.ch3.No4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface IntSequence {
    static IntSequence[] of(int... ints) {
        List<Integer> names = List.of(1,2,3,4);
        Stream<Sequence> stream = names.stream().map(Sequence::new);
        
        
        return stream.toArray(Sequence[]::new);
        
        //        ArrayList<Integer> arr = new ArrayList<>();
//
//        for(int i = 0; i < ints.length; i ++) {
//            arr.add(Integer.valueOf(ints[i]));
//        }
//        Stream<Integer> arr2 = arr.stream();
//        return arr2.toArray(Sequence[] :: new);
    }
}
