package exerciseproblem.ch3.No6;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger>{
    private BigInteger i = new BigInteger("0");
    private BigInteger one = new BigInteger("1");
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        i = i.add(one);
        return i.multiply(i);
    }
}
