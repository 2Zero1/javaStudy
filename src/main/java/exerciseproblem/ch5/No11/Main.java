package exerciseproblem.ch5.No11;
/*
factorial 메서드를 재귀 형태로 작성하라. 이 메서드에서는 값을 반환하기 전에 모든 스택 프레임을 출력해야한다. 종류에 관계없이 예외 객체를 생성해(그렇지만
던지지는 말아야 한다) 5.1.8 미처리 예외와 스택 추적에서 설명한 스택 추적을 얻어라.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5, 1));
    }
    public static int factorial(int n, int result  ) {
        if ( n == 1) {
            new Exception().printStackTrace();
            System.out.println("잉");
            return result;
        }

        return factorial(n-1, result * n);
    }
}
