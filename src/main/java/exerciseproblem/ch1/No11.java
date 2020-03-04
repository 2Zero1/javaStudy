package exerciseproblem.ch1;

import java.util.Scanner;

public class No11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("문자열을 입력하시오");
        String value = in.nextLine();
        char[] speling = value.toCharArray();
        for (char item : speling) {
            System.out.print((int)item+" ");
            String unicode = String.format("\\u%04x", (int)item);
            System.out.print(unicode);
            System.out.println();
        }
    }
}
