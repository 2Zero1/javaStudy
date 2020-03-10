package exercise.Ch3;

import java.util.ArrayList;

public class ReferThis {
    public boolean equals(String a) {
        System.out.println(a);
        return true;
    }

    public void test() {
        System.out.println("시작");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("B");
        arr.add("C");
        arr.forEach(this::equals);
    }
}
