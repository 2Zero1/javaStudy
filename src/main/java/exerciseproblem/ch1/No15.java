package exerciseproblem.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class No15 {
    public static void main(String[] args) {
        System.out.println("정수 입력 : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][];
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
//        for (int i = 0 ; i < n ; i++) {
//            arr[i] = new int[i + 1];
//            arr[i][0] = 1;
//            arr[i][i] = 1;
//            for (int j = 1;j < i; j++) {
//                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
//            }
//        }
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%4d", arr[i][j]);
//            }
//            System.out.println();
//        }
//        ar.add(new ArrayList<>());


        for (int i = 0 ; i < n ; i++) {
            ar.add(new ArrayList<>());
            ar.get(i).add(0, 1);
            for (int j = 1;j < i; j++) {
                ar.get(i).add(j, ar.get(i-1).get(j-1) + ar.get(i-1).get(j));
            }
            if(i != 0)
            ar.get(i).add(1);
        }

        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j < ar.get(i).size(); j++){
                System.out.printf("%4d", ar.get(i).get(j));
            }
            System.out.println();
        }
    }
}
