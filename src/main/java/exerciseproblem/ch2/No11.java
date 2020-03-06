package exerciseproblem.ch2;

import java.time.LocalDate;

//Cal 클래스에서 System과 LocalDate 클래스를 정적으로 임포트해서 사용하도록 Cal 클래스를 재 작성 하라.
import static java.lang.System.*;
import static java.time.LocalDate.*;
public class No11 {
    public static void main(String[] args) {
        out.println("hell");
        out.println(of(111,1,1).getDayOfWeek());
    }

}
class Cal {
}
