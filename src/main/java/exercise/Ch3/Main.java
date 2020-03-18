package exercise.Ch3;


import exercise.Ch4.Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        SquareSequence squareSequence = new SquareSequence();
        System.out.println(squareSequence.next());
        System.out.println(squareSequence.next());
        System.out.println(squareSequence.next());
        System.out.println(average(squareSequence, 100));

        //유한 시퀀스(가장 낮은 자릿수 부터 시작해 양의 정수를 구성하는 숫자)를 돌려줌.
        DigitSequence ds = new DigitSequence(1729);
        while (ds.hasNext()) {
            System.out.print(ds.next() + " ");
        }

        // 인터페이스 타입으로 변환
        IntSequence digits = new DigitSequence(1729);
        double avg = average(digits, 100);
        System.out.println();
        System.out.println(avg);

        //캐스트와 instanceof 연산자
        //IntSequence 변수에 저장된 객체가 실제로는 DigitSequence라는 사실을 안다면 다음과 같이 타입을 변환할 수 있다.
        //S -> T 로 타입 변환시 cast(강제변환)을 사용해야한다.
        IntSequence sequence = new DigitSequence(10);
        DigitSequence digits2 = (DigitSequence) sequence;


        //잘못 캐스트하면 컴파일 시간 오류나 클래스 캐스트 예외(ClassCastException)를 던진다.
//        String digitString = (String) sequence;
        //밑의 클래스는 IntSequence를 상속받지 않은 클래스를 변수로 선언한 후에, IntSequence를 상속받은 객체를 캐스트하고 있다.
//        RandomSequence randoms = (RandomSequence) sequence;

        // 이전에 원하는 타입인지 검사하기
        if (sequence instanceof DigitSequence) {
            DigitSequence digitSequence = (DigitSequence) sequence;
        }

        //인터페이스 상수 사용
        System.out.println(SwingConstants.EAST);


        //기본 메서드의 충돌 해결하기
        Employee employee = new Employee();
        System.out.println("employee id : " + employee.getId());

        //클래스와 인터페이스에 동일한 메서드가 존재하며 인터페이스는 기본 메서드로 정의 했을 경우, 이때는 슈퍼클래스의 메서드만 중요하고 인터페이스의 기본 메서드는 무시됨
        TestExtend testExtend = new TestExtend();
        System.out.println(testExtend.test());

        //Comparable 인터페이스


        Employee2 employee1 = new Employee2(1);
        Employee2 employee2 = new Employee2(2);

        System.out.println(employee1.compareTo(employee2));

        Employee2 employee21 = new Employee2(1, 1000);
        Employee2 employee22 = new Employee2(1, 2000);

        System.out.println(employee21.compareTo(employee22));

        String[] friends = {"B", "C", "A", "Z", "F", "C"};
        int[] numbers = {241,285,511,2,2,3,4,5};
        Employee[] employees = {new Employee(), new Employee()};
        Arrays.sort(friends);
        Arrays.sort(numbers);
//        Arrays.sort(employees);
        for (String item : friends){
            System.out.print(item+" ");
         }
        System.out.println();

        for (int item : numbers){
            System.out.print(item+" ");
        }

        String[] words = {"aad","aaab","ca","aaaaa"};
        //comparator 인터페이스
        Comparator<String> comp = new LengthComparator();
//
//        if (comp.compare(words[0],words[1]) > 0) {}

        String[] friends2 = {"Peter","Paul","Mary"};
        if(comp instanceof Comparator) {
            System.out.println("왜안되");
        }
        Sub sub = new Sub();
        sub.test(sub);

        //클래스를 상속 받는다면 상속 받는 클래스의 변수 안에 서브 클래스의 인스턴스도들어가야 되는거 아님 ?
//        Arrays.sort(friends2, new LengthComparator());


        //Runnable 인터페이스
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();

//        Button cancelButton = new Button("Cancel");
        System.out.println(new CancelAction() instanceof EventHandler);
//        cancelButton.setOnAction();

        //람다 표현식
        Comparator<String> lamda = (String first, String second) -> first.length() - second.length();

        Comparator<String> lamda2 = (String first, String second) -> {
            int difference = first.length() - second.length();
            if (difference < 0) return -1;
            else if (difference > 0) return -1;
            else return 0;
        };
//        LamdaTest lamdaTest = () -> {};

        EventHandler<ActionEvent> listener = event -> {
            System.out.println("oh noes!");
        };

        Arrays.sort(words, (first, second) -> first.length() - second.length());
        for (String item : words) {
            System.out.println(item);
        }

//        String[] a = ;
        //함수형 인터페이스
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(null);
        list.add("c");
        for (String item : list) {
            System.out.println(item);
        }
        list.removeIf(e -> e == null);
        for (String item : list) {
            System.out.println(item);
        }

        //메서드 참조와 생성자 참조
        String[] strings = {"a","z","b","c","a","a","d","A","B","B"};
        Arrays.sort(strings, (x, y) -> x.compareToIgnoreCase(y));
        Arrays.sort(strings, String::compareToIgnoreCase);
        for(String item : strings) {
            System.out.print(item+" ");
        }
        System.out.println();

        String[] strings1 = {"a","z","b","c","a","a","d","A","B","B", null};

        list.removeIf(Objects::isNull);
//        for(String item : strings) {
//            System.out.print(item+" ");
//        }

        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);

        ReferThis referThis = new ReferThis();
        referThis.test();

        //생성자 참조
        List<String> names = List.of("a","b","c","d");
        Stream<Employee> stream = names.stream().map(Employee::new);

        List<Integer> numbers2 = List.of(1,2,3,4);
        numbers2.stream().map(int[]::new);

        Object[] employees2 = stream.toArray();

        stream = names.stream().map(Employee::new);

        Employee[] buttons = stream.toArray(Employee[]::new);
        System.out.println("뭐냐잉");
        for (Employee item : buttons) {
            System.out.println(item.getName());
        }

//        repeat(10, () -> System.out.println("Hello, World"));
        repeat(10, i -> System.out.println("CountDown: "+ (9 - i)));

        DoubleConsumer a = k -> System.out.println(k);
        a.accept(1.111);

        //독자적인 함수형 인터페이스 구현
        Image image = new Image();
        BufferedImage frenchFlag = image.create(150, 100,
                (x, y) -> x < 50 ? Color.BLUE : x < 100 ? Color.WHITE : Color.RED);


        int first = 0;
//        Comparator<String> comp3 = (first, second) -> first.length() - second.length();

        Application application = new Application();
        application.doWork();
        repeatMessage("hi",5);

        // 향상된 for 루프의 변수는 유효 범위가 단일 반복(single iteration)이므로 사실상 최종이다.

        String[] args2 = {"a","b","c","d","e"};
        for( String arg : args2) {
            new Thread(() -> System.out.println(arg)).start();
        }

        Data data = new Data();
        data.a = 10;
        repearMessage("aa",data,2);

        Arrays.sort(friends, compareInDirection(1));
        for(String item : friends) {
            System.out.println(item);
        }

        Arrays.sort(friends, compareInDirection(-1));
        for(String item : friends) {
            System.out.println(item);
        }

        Arrays.sort(friends, reverse(String::compareToIgnoreCase));
        for(String item : friends) {
            System.out.println(item);
        }

        Employee[] employee3 = {new Employee("jack"),new Employee("peggy"),new Employee("gracyyy")};
        Arrays.sort(employee3, java.util.Comparator.comparing(Person::getName));
        for(Employee item : employee3) {
            System.out.println(item.getName());
        }

        Employee[] employee4 = {new Employee("jack",1),new Employee("jack",3),new Employee("jack",2)};
        Arrays.sort(employee4, java.util.Comparator.comparing(Person::getName).thenComparing(Person::getId));
        for(Employee item : employee4) {
            System.out.println(item.getName() + item.getId());
        }

        Arrays.sort(employee3, java.util.Comparator.comparing(Person::getName, (s, t) -> s.length() - t.length()) );
        for(Employee item : employee3) {
            System.out.println(item.getName());
        }

        Arrays.sort(employee3, java.util.Comparator.comparingInt(p -> p.getName().length()));
        for(Employee item : employee3) {
            System.out.println(item.getName());
        }

        System.out.println("========");
        Employee[] employee5 = {new Employee(null,1) ,new Employee("jack",35),new Employee("jack",3),new Employee("jack",2), new Employee(null,22), new Employee(null,15)};
        Arrays.sort(employee5, java.util.Comparator.comparing(Person::getName, java.util.Comparator.nullsFirst(java.util.Comparator.naturalOrder())));
        for(Employee item : employee5) {
            System.out.println(item.getName());
        }



    }

public static java.util.Comparator<String> reverse(Comparator<String> comp) {
        return (x, y) -> comp.compare(y, x);
}

public static java.util.Comparator<String> compareInDirection(int direction) {
        return (x, y) -> direction * x.compareTo(y);
}


//두 스레드가 count를 동시에 업데이트 할 경우 count 값이 정의 되지 않음.
    public static void repearMessage(String text, final Data count, int threads) {
        Runnable r = () -> {
            while(count.a > 0) {
                count.a --;   //오류 캡처한 변수를 변경할 수 없음.
                System.out.println(count.a);
                System.out.println(text);
            }
        };
        for (int i = 0; i < threads; i++) new Thread(r).start();
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };
        new Thread(r).start();
}

public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
}
//public static void repeat(int n, Runnable action) {
//        for (int i = 0; i < n; i++) action.run();
//}

    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }
}
class Data {
    int a = 10;
}