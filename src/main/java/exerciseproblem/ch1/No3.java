package exerciseproblem.ch1;

import java.util.Scanner;

//## 3. 조건 연산자만을 사용해 정수 세개를 읽고 최댓값을 출력하는 프로그램을 작성하가. Math.max를 사용해 같은 프로그램을 작성하라.
public class No3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("첫번재 정수값을 입력하시오 : ");
        int a = in.nextInt();
        System.out.println("두번재 정수값을 입력하시오 : ");
        int b = in.nextInt();
        System.out.println("세번재 정수값을 입력하시오 : ");
        int c = in.nextInt();

        int max = 0;

        if(a > max) {
            max = a;
        }
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }

        //조건부 연산자 만들 사용하여 찾은 최댓값.
        System.out.println("Max : "+max);

        //Math.max 메서드를 사용해서 찾은 최댓값
        System.out.println("Max : "+ Math.max(Math.max(a,b),c));

    }


}
