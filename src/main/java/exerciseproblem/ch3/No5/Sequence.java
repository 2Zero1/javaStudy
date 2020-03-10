package exerciseproblem.ch3.No5;

public interface Sequence {
    /*익명을 사용하지 않음
무한 상수 시퀀스를 돌려주는 IntSequence 클래스의 정적 메서드 constant를 추가하라.(예를 들어 IntSequence.constant(1)은
 1 1 1... 을 돌려준다. 람다 표현식으로 만들면 추가 점수가 있다.)
 문제가 이해가 되지 않는다.
 */
    int next();

    boolean hasNext();
}
