package exercise.Ch5;

import java.io.FileNotFoundException;

public interface consumer<T> {
    void accept(T t) throws FileNotFoundException;
}
