package exerciseproblem.ch3.No2;


import java.util.Arrays;
import java.util.Comparator;

//연습 문제 1에 이어서 Measurable largest(Measurable[] objects) 메서드를 만든다. 이 메서로 급여가 가장 높은 직원의 이름을 구하라.
public class Main {
    public static void main(String[] args) {
        Measurable[] measurables = {new Employee("jack",10000), new Employee("peggy",140000), new Employee("grace",10000)};
        Employee employee = (Employee) largest(measurables); // largest는 Measurable 타입을 반환한다. 하지만 Employee의 이름은 해당 타입에 없으므로, 서브 타입으로 캐스팅해줘야한다.
        System.out.println(employee.getName());
    }
    public static Measurable largest(Measurable[] objects) {
        //키 추출 함수(Comparator.comparing)를 사용하였고, 비교자를 함께 넣어 어떻게 역으로 정렬하도록 하였음.
        Arrays.sort(objects, Comparator.comparing(Measurable::getMeasure,(s, t) -> Double.compare(t, s)));

        return objects[0];
        //단순히 Comparator가 제공하는 comparing(T 타입을 String 처럼 비교 가능한 타입으로 매핑하는 키추출 함수)를 사용하여 순서대로 나열 한 후에 처리.
//        Arrays.sort(objects, Comparator.comparing(Measurable::getMeasure));
//        return objects[length - 1];
    }


}
