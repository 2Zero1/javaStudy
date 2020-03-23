package exercise.Ch6;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public class Exceptions {
    private static <T extends Throwable>
    void throwAs(Throwable e) throws T {
        throw  (T)e;
    }
    public static String readAll(Path path) {
        return doWork(() -> new String(Files.readAllBytes(path)));
    }
    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch(Throwable ex) {
            Exceptions.<RuntimeException> throwAs(ex);
            return null;
        }
    }
}

