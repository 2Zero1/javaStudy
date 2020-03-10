package exerciseproblem.ch3.No5;

//무한 상수 시퀀스를 돌려주는 IntSequence 클래스의 정적 메서드 constant를 추가하라.(예를 들어 IntSequence.constant(1)은
// 1 1 1... 을 돌려준다. 람다 표현식으로 만들면 추가 점수가 있다.)
public class Main {
    public static void main(String[] args) {
        Sequence intSequence = IntSequence.of(1);

        while(true) {
            System.out.println(intSequence.next());
        }
    }
}
