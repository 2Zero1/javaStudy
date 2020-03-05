package exercise.Ch2;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {
    public int a = 0;
    public static final ArrayList<Integer> expirationYear = new ArrayList<>();
    static {
        // 다음 20개 연도를 배열 리스트에 추가한다.
        int year = LocalDate.now().getYear();
        for (int i = year; i<= year + 20; i++) {
            expirationYear.add(i);
        }
    }

    public static String getString() {
        return "hello";
    }
    public int getInt() {
        return 1;
    }
}
