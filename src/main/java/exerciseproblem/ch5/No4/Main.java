package exerciseproblem.ch5.No4;

/*
No4. 연습문제 1~3을 반복하되, 이번에는 예외를 사용하지 말아야 한다. 그 대신 readValues와 sumOfValues에서 어떤 종류의 오류 코드를 반환하게 만들어라.

ArrayList가 반환 타입인데 어떻게 오류 코드를 반환함 .. ? 코드를 어떤 방식으로 줘야함 ?
 */

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(sumOfValues("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exerciseproblem/ch5/No1No2No3/doubleFile")
);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static double sumOfValues(String filename) throws IOException {
        ArrayList<Double> arr =  readValues(filename);
        Optional<Double> result = arr.stream().reduce((acc, cur) -> acc+cur);

        return result.get();
    }

    public static ArrayList<Double> readValues(String filename) throws IOException {
        //파일 접근 한다.
        //파일을 공백을 기준으로 하나씩 읽어온다.
        //동시에 Double.parse를 사용하여 형변환 후 ArrayList에 넣어준다.
        ArrayList<Double> arrayList = new ArrayList<>();
        try(Scanner in = new Scanner(Paths.get(filename))) {
            while (in.hasNext()){
                arrayList.add(Double.parseDouble(in.next()));
            }
        }

        return arrayList;
    }
}
