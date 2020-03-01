package exerciseproblem.ch1;

import java.util.Scanner;

//## 2. 정수(양의 정수 또는 음의 정수)로 된 각도를 읽고 0 ~ 359 도 사이의 값을 정규화하는 프로그램을 작성하라(먼저 %연산자를 사용한 후 floorMod 메서드를 이용해 작성한다.)
public class No2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수를 입력하시오 : ");
        int input = in.nextInt();
        int extra = 0;

//            extra  = (input % 360 + 360) % 360;
        extra  = Math.floorMod(input,360);

        System.out.println(extra);
    }
}
