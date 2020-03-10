package exercise.Ch3;

public class MultiImplementation implements IntSequence, Closeable {
    @Override
    public void close() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        return 0;
    }
}
