package exerciseproblem.ch5.No15;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.*;

// HTML 파일을 만들어 내는 레코드 포매터를 구현하고 테스트하라.
public class Main {
    public static void main(String[] args) throws IOException {
        Format format = new Format();
        Logger logger = Logger.getLogger("logger");
        PrintWriter out3 = new PrintWriter("/tmp/output3.txt");



        FileHandler consoleHandler = new FileHandler();
        consoleHandler.setFormatter(format);
        logger.addHandler(consoleHandler);
        logger.info("hehet");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gg");
        System.out.println(stringBuilder.toString());

    }
}
