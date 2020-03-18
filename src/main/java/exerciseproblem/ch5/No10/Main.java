package exerciseproblem.ch5.No10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Scanner와 PrintWriter 클래스의 메서드는 초보 프로그래머도 쉽게 사용하게 하려고 검사 예외를 던지지 않는다. 읽기나 쓰기 도중에 오류가 일어났는지 여부를
어떻게 알 수 있을까? 생성자는 검사 예외를 던질 수 있다는 점에 유의한다. 이 점이 초보자도 사용하기 쉽게 만든다는 목표를 저해하는 이유를 설명하라.
 */
public class Main {
    public Main() throws IOException {
        Files.newBufferedReader(Paths.get("aaa"), StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner();
//        scanner.hasNextBoolean();
//        scanner.next();
//        scanner.hasNext();
//        scanner.close();
        try {
            PrintWriter a = new PrintWriter("a");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
