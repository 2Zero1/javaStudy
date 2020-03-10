package exerciseproblem.ch3.No13;

//File 객체의 배열을 받아서 디렉터리가 파일 앞에 나타나도록 정렬하라. 그리고 각 그룹 안에서는 요소들을 경로 이름으로 정렬한다. Comparator를 지정할 때 람다 표현식을 사용하라

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exerciseproblem/ch3");

        Comparator<File> comp = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if (o1.isDirectory() && o2.isDirectory()){
                    return -1;
                }else if(o2.isDirectory() && !o1.isDirectory()){
                    return 1;
                }
                return -1;
            }
        };

        Comparator<String> comp2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        File[] names = file.listFiles((v, name) -> true);

        //디렉토리 명 뒤에 숫자가 붙어있을 경우, 다 문자로 취급하다 보니 오름 차순인데도 불구하고 2보다 10가 더 먼저 나온다 어떻게 해결할까 ?
        Arrays.sort(names, Comparator.comparing(File::isDirectory).thenComparing(File::getName));
        for (File item : names) {
            System.out.println(item.getName());
        }


    }
}
