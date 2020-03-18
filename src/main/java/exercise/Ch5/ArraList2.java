package exercise.Ch5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class  ArraList2<T> extends ArrayList<T> {
    public ArraList2(int initialCapacity) {
        super(initialCapacity);
    }

    public ArraList2() {
    }

    public ArraList2(Collection<? extends T> c) {
        super(c);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        super.forEach(action);
    }
    public void write(consumer<? super T> action) {

    }
}
