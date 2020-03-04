package exerciseproblem.ch1;

import java.util.ArrayList;
import java.util.Random;

public class No13 {
    public static void main(String[] args) {
        ArrayList<Integer> lotto = new ArrayList<>();
        int counts = 50;
        for(int i = 0;i < counts; i++) {
            lotto.add(i);
        }
        Random random = new Random();

        int [][] results = new int[6][6];

        for(int i = 0; i < 6 ; i ++) {
            for(int j = 0; j < 6; j ++) {
                results[i][j] = lotto.remove(random.nextInt(counts--));
            }
        }

        for(int i = 0; i < 6 ; i ++) {
            for(int j = 0; j < 6; j ++) {
                System.out.print(results[i][j]+" ");
            }
            System.out.println();
        }

    }
}
