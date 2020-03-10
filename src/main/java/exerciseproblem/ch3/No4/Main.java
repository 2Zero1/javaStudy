package exerciseproblem.ch3.No4;

import java.util.stream.IntStream;

//인수들로 구성된 시퀀스를 돌려주는 IntSequence 클래스의 정적 메서드 of를 구현하라. (예를 들어 IntSequence.of(3, 1, 4, 1, 5, 9)
//는 값 여섯 개로 구성된 시퀀스를 돌려준다. 익명 클래스의 인스턴스를 반환하게 하면 추가 점수가 잇다.
    public class Main {
    public static void main(String[] args) {

        for (IntSequence item :  IntSequence.of(1,2,3,4,5)) {
            Sequence a = (Sequence)item;
            System.out.println(a.getSeq());
        }

        //익명 인스턴스로 구현한 것.
        for (IntSequenceInterface item :  IntSequence2.of(1,2,3,4,5)) {
            System.out.println(item.getSequence());
        }
    }
}
