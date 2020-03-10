package exercise.Ch3;

public class SquareSequence implements IntSequence {
    public int i;
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        i++;
        return i;
    }
}
