package exerciseproblem.ch1;

//## 8. 문자열을 읽어서 비어 있지 않는 부분 문자열을 모두 출력한느 프로그램을 작성하라.

import java.util.Scanner;

public class No8 {
    public static void main(String[] main) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        String input = in.nextLine();
        String[] words = input.split(" ");
        for(String word : words) {
            System.out.println(word+" ");
        }
    }
}
