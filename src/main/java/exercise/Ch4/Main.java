package exercise.Ch4;

import exercise.extraPackage.Cipher;
import exerciseproblem.ch2.Point;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.*;
import java.util.*;

public class Main {
    public enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    public enum Size1 {
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
        private String abbreviation;

        Size1(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

    public static ServiceLoader<Cipher> ciphers = ServiceLoader.load(Cipher.class);

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : ciphers) {
            if (cipher.strength() >= minStrength) return cipher;
        }
        return null;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Manager boss = new Manager("jack", 10000);
        boss.setBonus(1000);
        boss.raiseSalary(5);


        Employee employee = new Employee("grace", 10000);
        employee.setManager(boss);

        employee.getSupervisor();

        //슈퍼클래스 할당
        Employee empl = boss;
        System.out.println("월급 : " + empl.getSalary() + "Employee 타입인데 불구하고 Manager 타입의 메서드를 호출한다.");

        //모든 직원들을 그냥 Employee로 동작 하도록 하기
        Janitor janitor = new Janitor("Han", 10000);

        Employee[] staffs = new Employee[3];
        staffs[0] = boss;
        staffs[1] = employee;
        staffs[2] = janitor;

        double sum = 0;
        for (Employee item : staffs) {
            sum += item.getSalary();
        }
        System.out.println(sum);
        //동적 메서드 조회 덕분에 empl.getSalary() 호출은 item이 참조하는 객체에 속한 getSalary(Manager.getSalary) 메서드를 호출한다.

        //슈퍼클래스 할당은 배열에도 적용된다. (기술적인 용어로 표현하면 자바 배열은 공변(covariant)한다) 편리하지만 타입 오류를 일으킬 가능성이 있어 적절하진 않다.
        Manager[] managers = {new Manager("jack", 1000)};
        Employee[] empls = managers;
        // ArrayStoreException 에러를 던진다.
        // empls와 managers는 Manager[]를 참조하기 때문에 Employee를 저장할 수 없다. 밑의 이유와 같다.
//        empls[0] = new Employee();

//        Manager manager = new Employee("Han",1000); 서브 클래스에 슈퍼 클래스를 넣기 위해선 캐스팅을 해야함. 캐스팅의 조건으로는 슈퍼클래스가 서브클래스의 인스턴스를 참조해야함. 그렇지 않으면 에러를 반환
//        Manager[] test = {new Employee()}; 이것 또한 위와 동일한 이유로 인해 에러를 발생

        //super class가 subclass의 인스턴스를 참고하면 슈퍼클래스에 있는 메서드만 호출할 수 있다.
        empl = new Manager();
//        empl.setBonus(1000);  //컴파일러는 코드에서 수신한 타입의 메서드만 호출하는지 검사하기 때문에 컴파일 시간에 에러난다.
        //인터페이스와 마찬가지로 instanceof 연산자와 캐스트로 슈퍼클래스 참조를 서브클래스로 변환할 수 있다.

        if (empl instanceof Manager) {
            Manager mgr = (Manager) empl;
            mgr.setBonus(10000);
        }

        //추상 메서드와 추상 클래스
        //추상 클래스의 인스턴스는 생성할 수 없다.
//        Person p = new Person();

        //하지만 추상 클래스를 구현한 서브클래스의 객체 참조를 추상 클래스 타입으로 변수를 선언하여 넣을 수 있다.
        Person p = new Student("Fred", 1729);

        //익명 서브클래스
        ArrayList<String> names = new ArrayList<String>(100) {
            @Override
            public void add(int index, String element) {
                super.add(index, element);
                System.out.printf("Adding %s at %d\n", element, index);
            }
        };

        ArrayList<String> friends1 = new ArrayList<>();
        friends1.add("Harry");
        friends1.add("Sally");

        //이중 중괄호 초기화(double brace initialization)
        new ArrayList<String>() {
            @Override
            public void add(int index, String element) {
                super.add(index, element);
            }

            {
                add("Harry");
                add("Sally");
            }
        }.forEach(System.out::println);

        //클래스를 확장하고 인터페이스를 구현하는 클래스가 있는데, 클래스와 인터페이스에 있는 메서드 잉름이 같은 경우 항상 슈퍼클래스 구현이 인터페이스 구현보다 우선이다.
        Student student = new Student("harry", 1);
        System.out.println(student.getName());

        //hashCode 검사

        Employee a = new Employee("harry", 11);
        Employee b = new Employee("harry", 11);
        Employee c = a;
        System.out.println(a.hashCode() + "  " + c.hashCode());

        Point point = new Point(10, 20);
        System.out.println(point.toString());

        System.out.println("" + employee);
        int[][] nums = {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}};

        System.out.println(Arrays.deepToString(nums));
        Objects.equals(empl, empl);

        /*
            public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
    Objects.equals는 객체 참조가 동일한지를 본다. 하지만 내부를 살펴보면 a.equals(b)로 변경한다.
    여기서도 equals 는 객체 참조가 동일한지를 본다. 현재 선언 타입은 Object 이지만 동적 메서드 조회를 통해
    객체가 String에 있는 equals 메서드를 사용하기 때문에 실제로는 String.equals에 정의된 실제 문자열이 동등한지 확인한다.
         */
        Item item = new Item("a", 1);
        Item item2 = new Item("a", 1);
        System.out.println(item.equals(item2));

        DiscountedItem discountedItem1 = new DiscountedItem("a", 1, 1);
        DiscountedItem discountedItem2 = new DiscountedItem("a", 1, 1);

        System.out.println(discountedItem1.equals(discountedItem2));

        EventItem eventItem = new EventItem("a", 1, 1, 1);
        //equals가 대칭적이지 않다. 첫번째 것은 할인 율을 고려하지 않고, 두번째것도 할인율을 고려하지 않는다.
//        System.out.println(item.equals(discountedItem1));
//        System.out.println(discountedItem1.equals(item));

        //동등성이 슈퍼클래스에 고정되어 서브클래스에서 절대 변하지 않을 경우
        Employee2 employee2 = new Employee2(1);
        Employee2 employee3 = new Employee2(2);
        System.out.println(employee2.equals(employee3));
        System.out.println("mimi".hashCode());
        int k = 1;
        int d = 2;
        k = d = 4;
        System.out.println(k + " " + d);

//object.clone을 이용한 얕은 복사.
        System.out.println(employee.clone().getName());
        System.out.println(Objects.equals(employee, employee.clone().getName()));

        Message message = new Message("YH", "Hello");

        System.out.println("==========");
        //원본에 영수증 값 입력
        message.add("a");
        message.add("b");
        message.add("c");
        message.array[0] = "SS";

        //원본에 종업원 값 입력
        message.employeeAdd(employee);
        message.employeeAdd(empl);

        message.iterate();
        message.employeeIterate();

        System.out.println("=원본=========");
        message.iterate();
        message.employeeIterate();
        for (String s : message.array) {
            System.out.println(s);
        }

        // 복사.
        Message coppied = message.clone();

        // 복사된 것의 영수증 값 입력
        coppied.add("d");
        coppied.add("e");
        coppied.add("f");
        message.array[0] = "NN";

        //복사된 것의 종업원 값 변경
        coppied.employees.get(0).setName("영한이");
        // 둘다 찍어보기
        System.out.println("=원본=========");
        message.iterate();
        message.employeeIterate();
        for (String s : message.array) {
            System.out.println(s);
        }
        System.out.println("=복사=========");
        coppied.iterate();
        coppied.employeeIterate();

        for (String s : message.array) {
            System.out.println(s);
        }

        //열거
        System.out.println(Size.SMALL);
        Size size = Size.valueOf("SMALL");
        System.out.println(Size.SMALL.ordinal());
        Size[] sizes = {Size.EXTRA_LARGE, Size.MEDIUM, Size.SMALL, Size.LARGE};
        Arrays.sort(sizes);
        for (Size i : sizes) {
            System.out.println(i);
        }

        System.out.println(Size1.MEDIUM.abbreviation);

        Size[] arr = Size.values();
        for (Size i : arr) {
            System.out.println(i);
        }

        //열거 인스턴스  바디
        System.out.println(EnumCode.Operation.ADD.eval(1, 2));

        System.out.println(EnumCode.eval(EnumCode.Operation.ADD, 1, 2));

        //실행 시간 타입 정보와 리소스
        Object obj = employee;
        Class<?> cl = obj.getClass();

        System.out.println("This object is an instance of " + cl.getName());
        try {
            Class<?> cl2 = cl.forName("exercise.Ch4.Employee");
            System.out.println(cl2.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //컴파일 시간에 알려지지 않은 클래스의 Class객체를 생성

        Class<?> class1 = java.util.Scanner.class;
        System.out.println(class1.getName());

        Class<?> class2 = double[].class;   //String[] 배열 타입을 기술
        Class<?> class3 = Runnable.class;   //Runnable 인터페이스를 기술
        Class<?> class4 = int.class;        // int 타입을 기술
        Class<?> class5 = void.class;       //void 타입을 기술.
        System.out.println(class5.getName());
        System.out.println(class2.getName());
        System.out.println(class3.getName());

        Class<?> class6 = int[].class;
        Class<?> class7 = String[].class;
        System.out.println(class6.getCanonicalName());//java.lang.String[] 또는 int[] 같은 이름을 얻기
        System.out.println(class1.getCanonicalName());//java.lang.String[] 또는 int[] 같은 이름을 얻기
        System.out.println(class1.getSimpleName());
        System.out.println(class1.getTypeName());
        System.out.println(class1.toString());
        System.out.println(class1.toGenericString());
        Class<?> class8 = java.lang.String.class;
        System.out.println("======");
//        for (Method field : class8.getMethods()) {
//            System.out.println(field.toString());
//        }

        //리소스 로드
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);

        //안됨. 클래스 파일과 동일한 패키지에 넣었는데도 .. 왜이러지 ?
//        File file = new File("config.txt");
//        System.out.println(file.exists());
//        System.out.println(file.list());
//        String[] asdf = file.list();
//        for (int i = 0; i < asdf.length; i++) {
//            System.out.println(asdf[i]);
//        }
//        InputStream stream = Main.class.getResourceAsStream("config.txt");
//        Scanner in = new Scanner(stream);
//        System.out.println(in.nextLine());
//        System.out.println("======");
//
//        System.out.println(in.nextLine());
//        try {
//            URL[] urls = {
////                    new URL("file:///Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exercise/Ch4/library.jar")};
////            File file = new File("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exercise/Ch4/library.jar");
////
////            System.out.println("왜안되"+file.exists());
////
////            try (URLClassLoader loader = new URLClassLoader(urls)) {
////                Class<?> cl2 = Class.forName("HelloWorld", true, loader);
////            }

//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        Test1 test1 = new Test1();
//        Test2 test2 = new Test2();
//        test1.check();
//        test2.check();
//
//        System.out.println("======");
//        System.out.println(getCipher(1).strength());

        //리플렉션
        // 지정한 클래스의 모든 메서드 출력
        try {
            Class<?> classs = Class.forName("exercise.Ch4.Employee");

            for (Method m : classs.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                                m.getReturnType().getCanonicalName() + " " +
                                m.getName() +
                                Arrays.toString(m.getParameters())
                );
//            classs = classs.getSuperclass();


            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("뭐여");

        Object object = employee;

        for (Field f : object.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            try {
                Object value = f.get(obj);
                System.out.println(f.getName() + " : " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        //리플렉션을 사용하여 객체의 필드 설정
        try {
            Field f = object.getClass().getDeclaredField("salary");
            f.setAccessible(true);

            double value = f.getDouble(obj);
            f.setDouble(obj, value * 1.1);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();

        }
        for (Field f : object.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            try {
                Object value = f.get(obj);
                System.out.println(f.getName() + " : " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        try {
            Class<?> classs = Class.forName("exercise.Ch4.Employee");
            Method e = classs.getMethod("print", String.class);
            e.invoke(null, "hello");

            Constructor constr = classs.getConstructor(String.class, double.class);


            Object obj3 = constr.newInstance("YH", 1239);
            Employee asdf = (Employee) obj3;
            System.out.println(asdf.getName());

            BeanInfo info = Introspector.getBeanInfo(classs);
            PropertyDescriptor[] props = info.getPropertyDescriptors();

            System.out.println("=========프러퍼티");
            for (PropertyDescriptor q : props) {
                if(q.getName().equals("salary"))
                    System.out.println(q.getReadMethod().invoke(employee));
            }
            int[] arrr = new int[10];
            System.out.println(arrr.getClass().getComponentType());
            Person[] friends = new Person[100];
            friends = Arrays.copyOf(friends, 2 * friends.length);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IntrospectionException ex) {
            ex.printStackTrace();
        }

        String[] kkk = {"!","2","3","4"};
        kkk = (String[]) goodCopyOf(kkk,10);
        for (String i : kkk) {
            System.out.println(i);
        }

        Object[] values = new Object[1000];

        System.out.println("=======");
        for (int i = 0; i < values.length; i ++) {
            System.out.println();
            Object value = new Integer(i);
            values[i] = Proxy.newProxyInstance(
                    null,
                    value.getClass().getInterfaces(),
                    (Object proxy, Method m, Object[] margs) -> {
                        System.out.println(value + "."+m.getName() + Arrays.toString(margs));
                        return m.invoke(value, margs);
                    }
            );
        }
//        System.out.println(values);
        Arrays.binarySearch(values, new Integer(500));

        for(Class a2 : Integer.class.getInterfaces()) {
            new ArrayList<>(List.of(a2.getMethods())).forEach(System.out::println);
//            System.out.println();
        }

//        Arrays.binarySearch()


        Person[] asdf = new Person[10];
        asdf[0] = new Person("aa") {
            @Override
            public int getId() {
                return 0;
            }
        };
        Object[] qq = (Object[])asdf;
        Person[] aaaa = (Person[]) qq;
        System.out.println(aaaa[0].getName());

    }

    public static Object badCopyOf(Object[] array, int newLength) {
        Object[] newArray = new Object[newLength];
        for (int i  = 0; i < Math.min(array.length, newLength);i ++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static Object goodCopyOf(Object array, int newLength) {
        Class<?> cl = array.getClass();
        if (!cl.isArray()) return null;
        Class<?> componentType = cl.getComponentType();
        int length = Array.getLength(array);    //array.length 랑 Array.getLength()랑 차이가 뭘까 ?
        Object newArray = Array.newInstance(componentType, newLength);
        for (int i = 0; i < Math.min(length, newLength); i++)
            Array.set(newArray, i, Array.get(array, i));
        return newArray;
    }
}
