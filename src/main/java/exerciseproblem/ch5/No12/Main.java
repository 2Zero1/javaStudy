package exerciseproblem.ch5.No12;

import java.util.Objects;

/*
Objects.requireNonNull(obj)와 assert obj != null을 사용하는 경우를 비교하라. 또 각각을 적절하게 사용하는 예를 제시하라.
 */
public class Main {
    public static void main(String[] args) {



    }

    public static String process2(String direction) {
        //그냥 테스트 할때 사용하고 실제 코드에선 지워줄 때 사용.
        assert direction != null;
        return direction;
    }
    public static String process(String direction) {

        //null값을 확인하여 대체값을 넣으면 좋을 경우에 사용?
        return Objects.requireNonNull(direction, "빈값이다.");
//        return Objects.requireNonNull(direction);
    }
}
