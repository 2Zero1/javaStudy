package exerciseproblem.ch3.No1;

/*먼저 객체를 어떤 방법으로 측정하는 double getMeasure() 메서드를 가진 Measurable 인터페이스를 만든다.
그 다음 Employee가 Measurable을 구현하게 한다. 마지막으로 평균 측정치를 계산하는 double average(Measurable[] object) 메서드
를 만들어 직원 배열의 평균 급여를 계산하는 데 사용하라.
*/
public class Main {

    public static void main(String[] args) {
        Measurable[] measurables = {new Employee("jack",10000), new Employee("peggy",140000), new Employee("grace",10000)};
        System.out.println(average(measurables));

    }
    public static double average(Measurable[] objects) {
        double result = 0;
        for (Measurable item : objects) {
            result += item.getMeasure();
        }
        return result / objects.length;
    }
}

