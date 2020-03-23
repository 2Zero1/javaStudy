package exercise.Ch3.second;

import exercise.Ch3.IntConsumer;
import exercise.Ch3.IntSequence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] arr = {"a","bb","cc","aaa","dddd"};
        Arrays.sort(arr,new LengthComparator());
        for (String a : arr) {
            System.out.println(a);
        }
        Call call = new Call();
        FutureTask futureTask = new FutureTask(new Call());

        new Thread(futureTask).start();

        new Thread(() -> System.out.println("hello")).start();
        System.out.println("gg");
        System.out.println(futureTask.get());

        System.out.println("gg");

        ArrayList<Integer> arr2 = new ArrayList<>(List.of(1,2,3,4,5));
        Stream<Employee> aaa = arr2.stream().map(Employee::new);

        Employee[] kk = aaa.toArray(n -> new Employee[n]);

        repeat(10, (v) -> System.out.println(9-v));
//        repeatMessage("gg",new int[]{1},1);

//        Arrays.sort(friends, compareInDirection(1));

        Arrays.sort(new Employee[]{new Employee(1)}, Comparator.comparing(Employee::getId));
        Arrays.sort(new Employee[]{new Employee(1)}, Comparator.comparing(Employee::getId, (s,t) -> t-s));

    }

    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x, y) -> comp.compare(y, x);
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }

    public static Comparator<String> compareInDirection(int direction) {
        return (String x,String y) -> direction * x.compareTo(y);
    }
//    public static IntSequence randomInts(int low, int high) {
//        class RandomSequence implements IntSequence {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public int next() {
//                return 0;
//            }
//        }
//    }

//    public static void repeatMessage(String text,final int[] count, int threads) {
//        Runnable r = () -> {
//            while(count[0] > 0) {
//                count[0] = 10;
//                System.out.println(text);
//            }
//        };
//        for (int i = 0; i < threads; i ++) new Thread(r).start();
//    }
}
