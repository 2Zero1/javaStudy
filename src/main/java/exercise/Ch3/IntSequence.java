package exercise.Ch3;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }

//    default boolean next() {
//        return true;
//    }
}
