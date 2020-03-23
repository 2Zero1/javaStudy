package exercise.Ch6;

import java.util.concurrent.Callable;

public class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

//    private static V default;
//    public static void setDefault(V value) { defaultValue = value;}
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static <V, T extends Throwable> V doWork(Callable<V> c, T ex) throws T {
        try {
            return c.call();
        }catch (Throwable realEx) {
            ex.initCause(realEx);
            throw ex;
        }
    }

}
