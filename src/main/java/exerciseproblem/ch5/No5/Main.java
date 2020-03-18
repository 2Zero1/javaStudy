package exerciseproblem.ch5.No5;

/*
try-with-resources 문에서 다룬 Scanner와 PrintWriter를 이용하는 코드를 포함하는 메서드를 구현하라. try-with-resources문은 사용하지 말고
catch 절을 이용하라. 두 객체를 올바르게 생성했다면 확실히 닫아야 한다. 그리고 다음 상황을 고려해야한다.

- Scanner 생성자는 예외를 던진다.
- PrintWriter 생성자는 예외를 던진다.
- hasNext, next, println은 예외를 던진다.
- out.close()는 예외를 던진다.
- in.close()는 예외를 던진다.

모르겠다.. 왜 다 예외를 던지는건지도 모르겠고, 각 메서드에서 무슨 예외가 나는지도 모르겠다.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        readValues("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exerciseproblem/ch5/No1No2No3/doubleFile");

    }

    public static ArrayList<Double> readValues(String filename) throws IOException {
        //파일 접근 한다.
        //파일을 공백을 기준으로 하나씩 읽어온다.
        //동시에 Double.parse를 사용하여 형변환 후 ArrayList에 넣어준다.
        ArrayList<Double> arrayList = new ArrayList<>();
        try{
            Scanner in = new Scanner(Paths.get(filename));
            PrintWriter printWriter = new PrintWriter("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exerciseproblem/ch5/result");
            while (in.hasNext()){
                printWriter.println(in.next());
            }
        } catch (IOException e) {

        }

        return arrayList;
    }
}
