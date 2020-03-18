package exerciseproblem.ch3.No7;

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
    private ArrayList<Integer> arr = new ArrayList<>();
    class DigitSequence implements Iterator<Integer> {
        ArrayList<Integer> copy ;
        public DigitSequence() {
            this.copy = new ArrayList<>(arr);
        }

        int i = 0;
        @Override
        public boolean hasNext() {
            return copy.size() > i;
        }

        @Override
        public Integer next() {
            Integer value = copy.get(i);
            i++;
            return value;
        }

        @Override
        public void remove() {

        }
    }
    public void add(int value) {
        arr.add(value);
    }
    public DigitSequence iterator() {
        return new DigitSequence();
    }
}