package exerciseproblem.ch2;


import java.time.DayOfWeek;
import java.time.LocalDate;

//달력 프로그램을 수정해서 한 주가 일요일부터 시작하게 하라. 또 줄 넘김은 끝에 한 번만 출력하게 만들어라.
public class No1 {
    static final int YEAR = 2020;
    static final int MONTH = 3;
    static final int DAY = 1;
    static final int DAYSOFWEEK = 7;
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(YEAR,MONTH,DAY);

        System.out.println("  Sun   Mon  Tue  Wed  Thu  Fri  Sat");

        DayOfWeek weekday = date.getDayOfWeek();
        int whatDay = weekday.getValue();

        if (whatDay != DAYSOFWEEK) {
            for (int i = 1; i < whatDay; i ++) {
                System.out.print("     ");
            }
        }


        while (date.getMonthValue() == 03) {
            System.out.printf("%5d", date.getDayOfMonth());
            if(date.getDayOfWeek().getValue() % 7 == 6) System.out.println();
            date = date.plusDays(1);
        }

    }
}
