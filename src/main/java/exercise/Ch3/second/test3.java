package exercise.Ch3.second;

import java.util.ArrayList;
import java.util.List;

public class test3 {
    class test4{
        public void main() {
            ArrayList<String> a = new ArrayList<>(List.of("a","b","c"));
            a.forEach(test3.this::equal
            );
        }
    }
    public void equal(String a) {

    }
    public void main() {
        ArrayList<String> a = new ArrayList<>(List.of("a","b","c"));
        a.forEach(this::equal);
    }
}
