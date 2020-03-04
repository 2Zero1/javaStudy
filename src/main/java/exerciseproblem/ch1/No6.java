package exerciseproblem.ch1;

import java.math.BigInteger;
import java.util.Scanner;

// 6. BigInteger를 사용해 팩토리얼 n! = 1 * 2 * ... * n 을 계산하는 프로그램을 작성하라. 그리고 프로그램을 이용해 1000!을 계산하라.
public class No6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수를 입력하시오 : ");
        int value = in.nextInt();
        BigInteger result = BigInteger.valueOf(1);
        BigInteger input = BigInteger.valueOf(value);
        while(!input.equals(BigInteger.valueOf(0))){
            result = result.multiply(input);
            input = input.subtract(BigInteger.valueOf(1));
        }
        System.out.println(result.toString());


        //BigInteger를 사용하지 않으면 큰 수를 팩토리얼 할때 0을 반환.
        int resultWithPrimitive = 1;

        while(value != 0) {
            resultWithPrimitive *= value;
            value--;
        }
        System.out.println(resultWithPrimitive);
    }


}
