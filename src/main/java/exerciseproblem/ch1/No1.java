package exerciseproblem.ch1;

import java.util.*;

//## 1. 정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라. 읽어 온 정수의 역수를 16진 부동 소수점 수로 출력하라.
public class No1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("정수를 입력하시오 : ");
        int input = in.nextInt();

        //정수를 2진수로 표현하라

        ArrayList<Integer> decimalList = new ArrayList<>();

        int forDecimal = input;
        do{
            decimalList.add(forDecimal % 2);
            forDecimal /= 2;
        }while(forDecimal != 0);

        Collections.reverse(decimalList);

        System.out.print("Decimal : ");

        for(int i : decimalList){
            System.out.print(i+" ");
        }
        System.out.println();

        //정수를 8진수로 출력하라.

        ArrayList<Integer> octalList = new ArrayList<>();

        int forOctal = input;

        do{
            octalList.add(forOctal % 8);
            forOctal /= 8;
        }while(forOctal != 0);

        Collections.reverse(octalList);

        System.out.print("octal : ");

        for(int i : octalList){
            System.out.print(i+" ");
        }
        System.out.println();

        //정수의 역수를 16진 출력

        ArrayList<Integer> hexList = new ArrayList<>();

        int forhex = input;

        do{
            hexList.add(forhex % 16);
            forhex /= 16;
        }while(forhex != 0);

        Collections.reverse(hexList);
        System.out.println(hexList.size());

        System.out.print("hex : ");

        for(int i : hexList){
            System.out.print(transfer(i)+" ");
        }
        System.out.println();

        //정수의 역수를 16진 부동소수점 수로 출력하라.

    }

    public static String transfer(int v) {
        switch (v) {
            case 10 : return "A";
            case 11 : return "B";
            case 12 : return "C";
            case 13 : return "D";
            case 14 : return "E";
            case 15 : return "F";
            default : return v+"";
        }
    }
}
