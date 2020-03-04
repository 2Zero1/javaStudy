package exerciseproblem.ch1;

// 5. int의 최댓값보다 큰 double을 int 타입으로 변환하면 무슨 일이 일어나는가? 직접 시도해보라
public class No5 {
    public static void main(String[] args) {
        double doubleValue = 2147483647.9192839;
        int intValue = (int) doubleValue;
        System.out.println(Math.nextUp(doubleValue));

        double doubleValue2 = 2147483647;
        System.out.println(Math.nextUp(doubleValue2));
    }
}
