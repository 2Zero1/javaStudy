package exerciseproblem.ch3.No12;

import java.io.File;

/*java.io.File 클래스의 list(FilenameFilter) 메서드를 사용해 주어진 디렉터리에서 주어진 확장자를 가진 모든 파일을 반환하는
메서드를 작성하라. FilenameFilter를 사용하지 말고 람다 표현식을 사용한다. 이 메서드는 자신을 감싸는 유효 범위에 있는 변수 중 어느것을
캡처하는가?

 */
public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exercise/Ch3");
        String[] fileNames = file.list((v,name) -> name.split("\\.")[1].equals("java"));

        for(String item : fileNames) {
            System.out.println(item);
        }
    }

}
