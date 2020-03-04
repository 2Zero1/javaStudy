package exerciseproblem.ch1;

import java.util.Scanner;

public class No16 {
    public static void main(String[] args) {

        System.out.println("정수 입력 : ");
        Scanner in = new Scanner(System.in);
        String[] inputs = in.nextLine().split(" ");

        double[] arr = new double[inputs.length];

        for(int i = 0; i < inputs.length; i++) {
            arr[i] = Double.parseDouble(inputs[i]);
//            System.out.println(arr[i]);
        }

        System.out.println(average(arr));
    }
    public static double average(double... values) {
        double result = 0;
        for(double item : values){
            result += item;
        }
        return result / values.length;

    }
}
