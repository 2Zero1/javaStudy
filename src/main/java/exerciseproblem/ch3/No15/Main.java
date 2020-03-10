package exerciseproblem.ch3.No15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
급여에 따라 직원을 정렬하는 Arrays.sort 호출을 작성하라. 순위가 같은 직원은 이름으로 정렬하라. 이때는 Comparator.thenComparing
을 사용하면 된다. 그런 다음 이 작업을 역순으로 수행하라.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> ar = new ArrayList<>();
        ar.add(new Employee("grace",1000));
        ar.add(new Employee("peggy",1000));
        ar.add(new Employee("han",1000));
        ar.add(new Employee("jack",10000));
        Employee[] employees = ar.stream().toArray(Employee[] ::new);
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary, (x,y) -> Double.compare(y,x)).thenComparing(Employee::getName,Comparator.reverseOrder()));
        ArrayList<Employee> arrayList = new ArrayList<>(List.of(employees));
        arrayList.forEach((v) -> System.out.println(v.getName()));
    }
}
