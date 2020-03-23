package exercise.Ch3.second;

import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Call implements Callable<String> {
    @Override
    public String call() throws Exception {
        int a = 1;
        for (int i = 0 ; i < 1000000; i ++) {
                a += i;
        }

        return a+"";
    }
}
