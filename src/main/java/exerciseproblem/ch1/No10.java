package exerciseproblem.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("정수를 입력 :");
        long value = in.nextLong();
        ArrayList<Long> arr = new ArrayList<>();

        do{
            arr.add(value % 36);
            value /= 36;
        }while(value != 0);
        Collections.reverse(arr);

        for (long item : arr) {
            System.out.print(transfer(item)+" ");
        }
    }
    public static String transfer(long v) {

        switch ((int)v) {
            case 10 : return "A";
            case 11 : return "B";
            case 12 : return "C";
            case 13 : return "D";
            case 14 : return "E";
            case 16 : return "F";
            case 17 : return "G";
            case 18 : return "H";
            case 19 : return "I";
            case 20 : return "J";
            case 21 : return "K";
            case 22 : return "L";
            case 23 : return "M";
            case 24 : return "N";
            case 25 : return "O";
            case 26 : return "P";
            case 27 : return "Q";
            case 28 : return "R";
            case 29 : return "S";
            case 30 : return "T";
            case 31 : return "U";
            case 32 : return "V";
            case 33 : return "W";
            case 34 : return "X";
            case 35 : return "Y";

            default : return v+"";
        }
    }

}
