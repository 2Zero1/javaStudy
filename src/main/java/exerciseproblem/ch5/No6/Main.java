package exerciseproblem.ch5.No6;

/*
finally 절에는 catch와 finally 절이 있는 잘못된 try 문 예제가 있다.(a) finally 절에서 예외를 잡는 방법, (b) try/finally문을 포함하는
try/catch 절을 이용하는 try-with-resources 문으로 코드를 고쳐라.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
    Path path = Paths.get("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exerciseproblem/ch5/No5/doubleFile");

    getA(path);
    getB(path);
    }
    public static void getC(Path path) {
        try( BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getB(Path path) {
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        }
    }

    public static void getA(Path path) {
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Caught IOException : "+e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println("Caught IOException when closing stream : "+e.getMessage());
                }
            }
        }
    }
}
