package exerciseproblem.ch5.No1No2No3;

/*
No1. 부동소수점 수가 저장된 파일을 읽는 public ArrayList<Double> read values(String filename) throws ... 메서드를 작성하라.
파일을 열 수 없거나 입력중 일부가 부동소수점 수가 아니면 적절한 예외를 던져야 한다.

No2. 연습문제 1에서 만든 메서드를 호출해서 파일에 들어 있는 값의 합계를 반환하는 public double sumOfValues(String filename) throws... 메서드를 작성하라.
예외가 일어나면 호출한 쪽으로 전파해야한다.

No3. 연습문제 2에서 만든 메서드를 호출해 나온 결과를 출력하는 프로그램을 작성하라. 예외가 일어나면 잡아서 사용자에게 오류 상황을 피드백하라.
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
