package exerciseproblem.ch2;

import java.util.Random;
import java.util.Scanner;

//Scanner 클래스의 nextInt 메서드를 생각해보자. 이 메서드는 접근자인가, 변경자인가? 그 이유는 ? Random 클래스의 nextInt 메서드는 어떤가 ?
public class No2 {
    public static void main(String[] args) {
        //변경자이다.
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        //nextInt를 받고 nextLine()을 하면 에러가 난다. 이유는 scanner에 nextInt에 숫자를 입력하고 엔터를 칠때의 개행 문자가 어딘가에 들어가있다.
        // 그래서 nextLine()을 버퍼에 개행문자가 있기 때문에 바로 리턴해버림. 모르겠음 사실 더 뜯어봐야함. nextInt 동작 방식을

        Random random = new Random();
        random.nextInt();
        // random을 보면 내부에 인스턴스 변수나 정적 변수(상수라면 상태가 아님.)를 바꾸는 내용이 없기 때문에
    }
}
