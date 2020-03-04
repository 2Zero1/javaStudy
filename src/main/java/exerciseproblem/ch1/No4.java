package exerciseproblem.ch1;

// 4. double 타입인 양수 값 중 가장 작은 값과 가장 큰 값을 출력하는 프로그램을 작성하라(자바 API에서 Math.nextUp를 찾는다.)
public class No4 {
    public static void main(String[] args) {
        System.out.println(Math.nextUp(Double.MIN_VALUE));
        System.out.println(Math.nextUp(Double.MAX_VALUE));  //왜 무한이 나올까 ?
    }
}
