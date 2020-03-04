package exerciseproblem.ch1;

import java.util.Scanner;

// 7. 0 ~ 4294967295 사이의 정수 두 개를 읽어서 int 변수에 저장한 후 부호 없는 합계, 차이, 곱, 몫, 나머지를 계산해 표시하는 프로그래믕ㄹ 작성하라.(long 값으로 변환하지 않아야한다.)

/*issue
1. 위의 두 수 사이의 정수 두개를 읽어 int 변수에 저장하라는데 이것 자체가 불가능한 일이다.
*/
public class No7 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("첫번째 정수를 입력하시오 : "+in.nextLine());
//        int input1 = Integer.parseUnsignedInt(in.nextLine());
//        System.out.println("두번째 정수를 입력하시오 : ");
//        int input2 = Integer.parseUnsignedInt(in.nextLine());
//        int a = 4294967294 * 0xffffffff;
        byte b = (byte) 0b11111111;
        System.out.println(b);
        System.out.println(b);
        System.out.println(b & 0xff);


        //어떻게 저 수를 4294967294를 int에 넣을 수가 있지 ..?
        //int가 어떻게 표현된는지 확인하자 2진수로
        //그리고 int의 max값을 얻어 이진수로 변한한 후에, 1을 더하면 음수 최솟값이 나올것이고..
        // int로 부호 비트까지 사용하는 방법이 뭘까 ?
    }
}
