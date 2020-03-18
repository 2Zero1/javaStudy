package exercise.Ch5;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//
//
//        ArraList2<String> list = new ArraList2<>();
//        list.write(obj -> write(obj, "output.dat"));
//
//        ArrayList<String> lines = new ArrayList<>();
//        try (PrintWriter out = new PrintWriter("output.txt")) {
//            for (String line : lines) {
//                out.println(line.toLowerCase());
//            }
//        }
//
////        PrintWriter out = new PrintWriter("output.txt");
////        try(out) {
////            for (String line : lines)
////                out.println(line.toLowerCase());
////        }
//
//        //여러 리소스를 세미콜론으로 구분해 선언
//
////        try (Scanner in = new Scanner(Paths.get("/"));
////        PrintWriter outt = new PrintWriter("output.txt")) {
////            outt.println(in.next().toLowerCase());
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
//        System.out.println(test());
//
//        BufferedReader in = null;
//
//
//        try {
//            try {
//                in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
//            } finally {
//                if (in != null) {
//                    in.close();
//                }
//            }
//
//        } catch (IOException e) {
//            System.err.println("Caught IOException: "+ e.getMessage());
//        }

//        try {
//
//        }catch (FileFormatException ex) {
//            Throwable ex2 = new FileFormatException("database error");
//            ex2.initCause(ex);
//            throw ex2;
//        }


        try{
            Class<?> cl = Class.forName("aaa");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();

           StackWalker walker = StackWalker.getInstance();
           walker.forEach(frame -> System.err.println("Frame : "+ frame));
        }
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);

        int a = 2;
        assert a > 3;
        assert a > 3 : a > 3;

        Super supe = new Super();
//        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().info(() -> "fe");

        Logger logger = Logger.getLogger("aa");
        logger.info("info");
        logger.fine("fine");
        logger.severe("finest");

        Logger logger1 = Logger.getLogger("com.mycompany");
        Logger logger2 = Logger.getLogger("com.mycompany.myapp");

        logger1.setLevel(Level.OFF);

        logger1.log(Level.INFO,"com.mycompany");
        logger2.log(Level.INFO,"com.mycompany.myapp");

    }

    public static int test () {
        try{
            throw new Exception();
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            try {
                throw  new Exception();
            } catch (Exception e) {
                System.out.println("final");
            }
        }
        return 1;

    }
    public static void write(Object obj, String filename)
        throws FileNotFoundException{

    }
}
