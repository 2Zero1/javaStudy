package exerciseproblem.ch5.No14;

import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/*
섹스, 마약, c++ 같은 나쁜 단어가 포함된 로그 레코드를 걸러 내는 레코드 필터를 구현 하고 테스트하라.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr .add("sex");
        arr .add("drug");
        arr .add("C++");

        Logger logger =  Logger.getLogger("com");

        logger.severe("hi");
        logger.setFilter(new Filter(){
            @Override
            public boolean isLoggable(LogRecord record) {
                if (arr.stream().filter(v -> record.getMessage().contains(v)).count() == 0){
                    return true;
                }else {
                    return false;
                }
            }
        });
        logger.severe("hello");
        logger.severe("sex");
        logger.severe("ssx1");

    }

}
