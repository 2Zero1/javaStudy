package exercise.Ch2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

public class Classes {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2011,10,4);
        System.out.println(date);
        System.out.println(date.plusDays(1));

//        while (date.getMonthValue() == 10) {
//            System.out.printf("%4d", date.getDayOfMonth());
//            date = date.plusDays(1);
//        }

        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println(weekday);

        int value = weekday.getValue();
//        System.out.println(value);
//        for (int i = 1; i < value ; i++) {
//            System.out.print("    "+ i);
//        }

        //객체 참조 가비지 컬렉터에게 수거되는 코드
        date = LocalDate.of(2000,10,1);
        date = date.plusDays(1);

        //인스턴스 메서드 호출
        Employee fred = new Employee();
        fred.raiseSalary(5);

        //this 자신을 매개변수로 넣기
        fred.test(fred);
        fred.salary = 1000;
        System.out.println("인상 전"+fred.salary);
        fred.employee.raiseSalary(10);
        System.out.println(fred.salary);

        //생성자에 this를 넣어서 사용하기
//        Employee jack = new Employee(jack, 10);// 자신인 jack을 넣어야 하는데, 아직 jack은 초기화 되지 않아서 안된다.

        //메서드는이 참조로 매개변수 객체에 접근하거나 매개변수 객체를 변경할 수 있다.
        EvilManager boss = new EvilManager();
        boss.giveRandomRaise(fred);
        System.out.println(fred.salary);
        fred.increaseRandomly(10);
        System.out.println(fred.salary);
        boss.replaceWithZombie(fred);
        System.out.println(fred.salary);

        //생성자에서 초기호 하지 않은 값들은 기본값이 들어간다.
        Employee employee = new Employee();
        System.out.println(employee.inta);
        System.out.println(employee.boooleana);
        System.out.println(employee.doubleb);
        System.out.println(employee.employee);

        //final 로 선언한 객체 변수를 변수 내의 인스턴스 변수를 변경
        final Employee employee1 = new Employee();
        employee1.salary = 1.1;
//        employee1 = new Employee(); //불가능
        System.out.println(employee1.salary);

        Person person = new Person();

        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        System.out.println(employee2.id);
        System.out.println(employee3.id);
        System.out.println(employee4.id);
        System.out.println(        Employee.generator.nextInt(10)
        );







    }
    static class EvilManager {
        private Random generator = new Random();

        //생성자에 반환 타입 붙히기.
        public void EvilManager(String name, double salary) {

        }

        public void giveRandomRaise(Employee e) {
            double percentage = 10 * generator.nextGaussian();
            System.out.println(generator.nextGaussian());
            e.raiseSalary(percentage);
        }

        public void replaceWithZombie(Employee e) {
            e = new Employee("", 0);
        }

        //오버로드
        public void test(int a) {

        }
        public void test(int a, int b) {

        }
        public int test(int a, int b, int c) {
            return 0;
        }




    }

    static class Employee {
        private String name;
        private double salary;
        Employee employee;
        private static final Random generator = new Random();
        private static int lastId = 0;
        private int id;

        //생성자에서 초기화 하지 않은 변수는 기본값으로 들어간다.
        int inta;
        boolean boooleana;
        double doubleb;

        //초기화 블록
        {
            inta = 1;
         System.out.println(test());
        }
        public String test() {
            return "init block!";
        }

        public Employee() {
            lastId++;
            id = lastId;
        }
        public Employee(String a, double salary) {
            this.salary = salary;
        }

        //생성자에서 특수문법 this를 사용하여 다른 생성자를 사용할 경우에 반드시 this 문법은 첫문장에 나와야한다.
//        public Employee(double salary) {
//            this.salary = salary;
//            this("",salary);
//
//        }
        public Employee(Employee e,double salary) {
            employee = e;
            this.salary = salary;
        }

        public void raiseSalary(double byPercent) {
            double raise = this.salary * byPercent / 100;
            this.salary += raise;
        }

        public String getName() {
            return this.name;
        }
        public void test(Employee e) {
            this.employee = e;
        }

        public void increaseRandomly(double x) {
            double amount = x * generator.nextDouble();
            x += amount;
        }
    }

    static class Person{
        private String name;
        private int age;

        public Person(){

        }
        public Person(String name){

        }
    }


}
