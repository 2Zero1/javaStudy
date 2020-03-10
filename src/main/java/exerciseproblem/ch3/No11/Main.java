package exerciseproblem.ch3.No11;

import java.io.File;
import java.io.FileFilter;

/*java.io.File 클래스의 listFiles(FileFilter)와 isDirectory 메서드를 사용해 주어진 디렉터리의 모든 서브디렉터리를 반환하는
메서드를 작성하라. FilenameFilter를 사용하지 말고 람다 표현식을 사용한다. 이 메서드는 자신을 감싸는 유효 범위에 있는 변수중 어느 것
을 캡처하는가?
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/");
        File[] files = file.listFiles((File v) ->  v.isDirectory());

        for (File item : files) {
            System.out.println(item.getName());
        }
    }
}
