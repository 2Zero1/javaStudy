package exerciseproblem.ch3.No5;

public class IntSequence {

    public static Sequence of(int n) {
        return new Sequence() {
            @Override
            public int next() {
                return n;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }

}
