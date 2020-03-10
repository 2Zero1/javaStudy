package exerciseproblem.ch3.No16;

import java.util.Random;

//3.9.1 지역 클래스에서 다룬 RandomSequence를 randomInts 메서드 외부에 있는 중첩 클래스로 구현하라.
public class Main {
    public static void main(String[] args){
       Sequence.RandomSequence randomSequence = Sequence.getRandomSequence(1,10);
       System.out.println(randomSequence.next());
    }
}

class Sequence {
    private static Random gen = new Random();
    public static RandomSequence getRandomSequence(int low, int high) {
        return new RandomSequence(low,high);
    }
    static class RandomSequence implements IntSequence{
        private int low, high;

        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public int next() {
            return low + gen.nextInt(high - low + 1);
        }

        @Override
        public boolean hasNext() {
            return true ;
        }
    }
}
