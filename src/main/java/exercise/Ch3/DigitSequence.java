package exercise.Ch3;

//유한 시퀀스(가장 낮은 자릿수 부터 시작해 양의 정수를 구성하는 숫자)를 돌려줌.
public class DigitSequence implements IntSequence {

    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    @Override
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest() {
        return number;
    }
}
