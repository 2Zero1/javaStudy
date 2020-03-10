package exerciseproblem.ch3.No6;

/*SquareSequence 클래스는 정수 오버플로 때문에 실제로 사각형의 무한 시퀀스를 주지 않는다. 구체적으로 어떻게 동작할까? Sequence<T>
인터페이스와 Sequence<BigInteger>를 구현하는 SquareSequence를 정의해 문제를 해결하라.
 */
public class Main {
    public static void main(String[] args){
        SquareSequence squareSequence = new SquareSequence();
        while(squareSequence.hasNext()){
            System.out.println(squareSequence.next());
        }
    }
}
