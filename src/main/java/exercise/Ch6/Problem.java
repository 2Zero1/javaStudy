package exercise.Ch6;

import java.util.concurrent.Callable;

public class Problem {
    public static <V ,T extends Throwable> V doWork(Callable<V> c, T ex) throws T {
        try {
            return c.call();
        } catch (Throwable realEx) {
            ex.initCause(realEx);
            throw  ex;
        }
    }
}
