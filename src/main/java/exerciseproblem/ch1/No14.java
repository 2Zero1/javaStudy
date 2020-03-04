package exerciseproblem.ch1;

import java.util.Scanner;

public class No14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [] firstRow = in.nextLine().split(" ");
        int length = firstRow.length;
        int [][] matrix = new int[length][length];
        int match = 0 ;
        for (int i = 0; i < length; i++) {
            matrix[0][i] = Integer.parseInt(firstRow[i]);
            match += Integer.parseInt(firstRow[i]);
        }

        for(int i = 1 ; i < length; i++) {

            String[] row = in.nextLine().split(" ");

            for (int j = 0; j < length; j ++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        for (int i = 0; i < length; i ++) {
            for (int j = 0; j < length; j ++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



        // 모든 가로 확인
        for (int i = 0; i < length; i ++) {
            int rowResult = 0;
            int columnResult = 0;
            for (int j = 0; j < length; j ++){
                rowResult += matrix[i][j];
                columnResult += matrix[j][i];
            }
            if (rowResult != match || columnResult != match) {
                System.out.println("false");
                return ;
            }
        }
        System.out.println("true");
    }
}
