package exercise.Ch1;


import java.io.Console;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    int abbs = 0;
    public static void main(String[] args) {
//        System.out.println("hello World");
//
//        //double의 none 값 확인.
//        Double none = Double.NaN;
//        if (Double.isNaN(none)) {
//            System.out.println("넌");
//        }
//
//        //유니코드 문자와 코드 유닛
//        char a = 74;
//        System.out.println(a);
//        System.out.println('\u004a');
//        System.out.println('\u263a');
//        int b = 'J';
//        System.out.println(b);
//
//        //escape 문자.
//        System.out.println("this is  \n test ");        //line feed
//        System.out.println("==================");
//        System.out.println("this is \rtest");         // carriage return 내 생각에 this is 를 썼다가 test를 다시 처음부터 덮어 쓰는게 아닌가 싶다.
//        System.out.println("==================");
//        System.out.println("this is \t test ");         // tab
//        System.out.println("==================");
//        System.out.println("this is\b test ");         // backspace 'this is' 까지 쳤다까 한칸 뒤로 움직여 s자리서 부터 다시 시작.
//        System.out.println('\'');
//        System.out.println('\\');
//
//        //문자와 쑤자는 라틴 알파벳에 한정되지 않고 모든 알파벳으로 구성.
//        int 자동차 = 1;
//        System.out.println(자동차);
//
//
//        // 자바는 변수명의 대소문자를 구분한다.
//        int count1 = 1;
//        int Count1 = 1;
//
//        System.out.println(count1 + Count1);
//
//        //메서드 안에 변수를 선언했다면 변수를 반드시 초기화 한 후 사용해야한다.
////        int count;
////        count++;
//        //컴파일러는 변수를 사용하기 전에 초기화 했는지 확인
////        int count;
////        int total = 1;
////        if (total ==0){
////            count = 0;
////        }else {
////            count ++;       //오류 - count가 초기화 되지 않았음.
////        }
//        //변수의 초기값으로 사용할 값을 얻는 시점에 변수를 선언.
////        Scanner in = new Scanner(System.in);
////        System.out.println("How old are you?");
////        int age = in.nextInt();
//
//        //final는 한번 할당하면 변경할 수 없는 값에 사용
//        final int DAYS_PER_WEEK = 7;
////        DAYS_PER_WEEK = 2;        //컴파일 에러
//
//        //final 변수를 처음 사용하기 전에 딱 한번만 초기화 한다면 초기화를 나중으로 미룰 수도 있다.
//        final int DAYS_IN_FEBRUARY;
//
//        if (true) {
//            DAYS_IN_FEBRUARY = 29;
//        } else {
//            DAYS_IN_FEBRUARY = 28;
//        }
//        //서로 관련이 있는 상수의 집합이 필요할 땐 열거타입을 정의하면 된다.
//        //enum class는 static으로 처리된다.
//        System.out.println(test.Weekday.MONDAY);
//
//        test.Weekday startday = test.Weekday.MONDAY;
//        System.out.println(startday);
//
//        //= 연산자 앞에 연산자를 붙힌 복합 연산자는 왼쪽과 오른쪽을 연산한 후 결과를 왼족에 할당.
//        int assignment = 10;
////        assignment %= 3;
//        int a1 = 2, b1 = 4;
//        int result = b1 & a1;
////        System.out.println(result);
//
////        System.out.println(-5 % 2 );
////        assignment = 2;
////
////        System.out.println(assignment);
//
//        // 시침 위치를 조정한 후 숫자를 0과 11사이로 정규화
//        int position1 = 0;
//        int adjustment1 = 4;
//
//        System.out.println((position1 + adjustment1) % 12);
//
//        //adjust에 음수가 들어갈 경우
//        int position2 = 0;
//        int adjustment2 = -4;
//
//        System.out.println(((position2 + adjustment2) % 12 + 12) % 12);
//
//        //floorMod를 사용한 방법
//        int position3 = 0;
//        int adjustment3 = 4;
//
//        System.out.println(Math.floorMod(position3 + adjustment3, 12));
//
//        int position4 = 0;
//        int adjustment4 = -4;
//        System.out.println(Math.floorMod(position4 + adjustment4, 12));
//
//
//        //하지만 나누는 수가 음수라면 음수를 반환한다. 하지만 이런 경우는 거의 없다고함.
//        int position5 = 0;
//        int adjustment5 = -4;
//        System.out.println(Math.floorMod(position5 + adjustment5, -12));
//        System.out.println(Double.MAX_VALUE);
//
//        //Math 함수
////        System.out.println(Math.multiplyExact(1000000000 , 3)); //Math를 사용하면 부 정확한 값이 아닌 에러를 반
//        //Math함수의 생성자는 Private로 선언되어 인스턴스를 생성할 수 없다.
//        //Math 함수의 메서드는 static으로 선언되어져 인스턴스로 호출할수 없다.
////        Math mathTest = new Math();
//
//
//        //Integer의 Math.compareUnsigned 메소드를 보면 integer의 최솟값 -2147483648를 입력값에 더해서 비교함.
//        //integer의 최솟값에 -1을 해버리면, integer의 최댓값에서 -1을 한 값이 반환된다.
//        System.out.println("최솟값에 -1");
//        System.out.println(-2147483648 - 1);
//        System.out.println(0x80000000 - 0x00000001);
//        //integer의 최댓값에 +1을 해버리면, integer의 최솟값에 -1을 한 값이 나옴.
//        System.out.println("최대값에 +1");
//        System.out.println(2147483647 + 1);
//        System.out.println(0x7fffffff + 0x00000001);
//
//
//        System.out.println(-2147483648 + 140);
//        System.out.println(-2147483648 - 180);
//
//        System.out.println("hey" + (0x80000000 - 1));
//
//        System.out.println(Math.pow(2, 32));
//        //Integer.compareUnsigned를 사용해보면 두개의 인자값을 int의 최솟값인 -2147483648을 더해 compare 함수를 실행한다.
//        System.out.println(Integer.compareUnsigned(140, 180));
//        System.out.println(Integer.divideUnsigned(140, 2));
//
//        System.out.println(~5); //0101 -> 1010
//
//        //숫자 타입 값을 변수에 할당하거나 메서드에 인수로 전달할 때 타입이 일치하지 않으면 값을 변환해야한다.
//        double x = 42;
//
//        double test4 = 0.1f;
//        int integer1 = 10;
//        float float1 = integer1;
//        System.out.println(float1);
//        System.out.println(test4);
//
//        //int 를 float으로 변환할떄 합법적이지만, 정보를 잃을 수도 있다.
//
//        float f = 123456789;
//
//        System.out.println(f);
//
//        float f2 = 12345678;
//
//        System.out.println(f2);
//        float f3 = 1234567;
//
//        System.out.println(f3);
//
//        //강제 변환
//
//        double integer3 = 3.75;
//        int n = (int) integer3;
//        System.out.println(n);
//        System.out.println(Math.round(integer3));
//
//        int n2 = (int) Math.round(integer3);
//        System.out.println(Math.round(integer3));
//
//        //Integer를 char로 변환할 경우
//        int tmp = 1;
//        char n3 = (char) ('J' + tmp);
//        //그럼 왜 char에 1(int)을 넣었을때는 왜 자동 캐스팅이 될까 ? 숫자만 단독으로 들어올땐 integer가 아니라 문자 코드로 나오는것 같다.
//        //아스키코드의 코를를 가리키는줄 알았는데, 아스키 범위가 벗언나 곳에도 문자가 나오는것으로 보아 다른걸 사용하지 않을까 싶다.
//        char n4 = 20000;
//        System.out.println(n4);
//        System.out.println("끝");
//
//        //더 작은 정수 타입으로 캐스트하면 하위 바이트들만 보존된다.
//        int n5 = (int) 3000000000L;
//        System.out.println(n5);
//
//        //boolean에 & | 연산자 사용
//        System.out.println(true | false);
//        System.out.println(true & false);
//        System.out.println(true & true);
//        System.out.println(false & false);
//
//        //bigInteger & bigInteger
//        BigInteger bigInteger = BigInteger.valueOf(876543210123456789L);
//        BigInteger bigInteger2 = BigInteger.valueOf(876543210123456789L);
//        System.out.println(876543210123456789L);
//        System.out.println(bigInteger);
//        System.out.println(bigInteger.multiply(bigInteger2));
//        System.out.println(bigInteger.add(new BigInteger("0")));
//
//        System.out.println(BigDecimal.valueOf(2, 0).subtract(BigDecimal.valueOf(11, 1)));
//
//        String[] arr = {"mack", "yoneh", "john"};
//        //문자열
//        String names = String.join(", ", arr);
//        System.out.println(names);
//
//        String str = null;
////        if(str.equals("World")){
//        if ("World".equals(str)) {
//            System.out.println("ㅎㅎ");
//        }
//
//        System.out.println("word".compareTo("world"));
//
//
//        //숫자와 문자열 사이의 변환
//
//        int num = 42;
//        String str2 = Integer.toString(num);
//        System.out.println(str2);
//        String str3 = Integer.toString(num, 3);
//        System.out.println(str3);
//
//        System.out.println(Integer.parseInt("101010"));
//        System.out.println(Integer.parseInt("101010", 2));
//
//        System.out.println(Double.toString(3.14));
//        System.out.println(Double.parseDouble(Double.toString(3.14)));
//
//        System.out.println("12345".startsWith("1234"));
//        System.out.println("12345".endsWith("45"));
//        System.out.println("12345".contains("45"));
//
//        System.out.println("12345".indexOf("5"));
//        System.out.println("1234555".indexOf("5"));
//        System.out.println("1234555".indexOf("5", 4));
//        System.out.println("-------------------------");
//        System.out.println("abcdef".lastIndexOf("c", 5));
//        System.out.println("abcdef".lastIndexOf("b", 0));
//        System.out.println("abcdef".replaceAll("b", "1"));
//        System.out.println("abcdef".toUpperCase());
//        String strTest1 = "abcde";
//        String strTest2 = "abcde";
//        System.out.println(strTest1.hashCode());
//        System.out.println(strTest2.hashCode());
//
//        String str4 = "aacdefaa";
//        System.out.println("string = " + str4);
//
//        // returns the index within this String
//        int retval = str4.offsetByCodePoints(1, 2);
//
//
//        // prints the index
//        System.out.println("index = " + retval);
//
//        int codePoint = str4.codePointAt(retval);
//        System.out.println(codePoint);
//
//        System.out.println(str4.charAt(2));
//
//        System.out.println(str4.codePointCount(0, str4.length()));
//
//        int[] codePoints = str4.codePoints().toArray();
//
//        for (int i = 0; i < codePoints.length; i++) {
//            System.out.println(codePoints[i]);
//        }
//
//        //입력과 출력
////        Scanner in = new Scanner(System.in);
////
////        System.out.println("What is your name ? ");
////        String name = in.nextLine();
////        System.out.println(name);
////        if(in.hasNextInt()) {
////            System.out.println("정수");
////        }else if(in.hasNextDouble()){
////            System.out.println("소수점");
////        } else if (in.hasNextLine()){
////            System.out.println("문자열");
////        }
//
//        //console을 사용하여 입력값을 보여주지 않기
////        Console terminal = System.console();
////        System.out.println(terminal);
////        String username = terminal.readLine("User name: ");
////        char[] passwd = terminal.readPassword("Password: ");
//        String name = "a";
//        int age = 1;
//        System.out.printf("%8.3f", 1000.0 / 3.0);
//        String tmp1 = String.format("Hello, %s. Next year, you'll be %d. \n", name, age);
//        System.out.println(tmp1);
//
////        System.out.printf("Hello, %s. Next year, you'll be %d.\n", name,age);
//
//        String test1 = "a";
//        switch (test1) {
//            case "a":
//                System.out.println("문자열 레이블 가능");
//        }
//
//
//        // 배열 생성
//
//        // 원하는 값을 알고 있을때, 중괄호 안에 원하는 값을 나열하면 된다.
//
//        int[] primes = {2, 3, 4, 5, 6, 7, 8};
//        for (int i = 0; i < primes.length; i++) {
//            System.out.println(primes[i]);
//        }
//
//        primes = new int[]{17, 19, 23, 39, 31};
//
////        primes = {1,2,3,4};
//
//        int[] primes2 = new int[]{17, 19, 23, 39, 31};
//        for (int i = 0; i < primes.length; i++) {
//            System.out.println(primes[i]);
//        }
//        ArrayList<String> freinds = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
//        freinds.remove(1);
//        freinds.add(1, "new");
//        for (int i = 0; i < freinds.size(); i++) {
//            System.out.println(freinds.get(i));
//        }
//
//        int e = 1000;
//        Integer integer = 1000;
//        Integer integer2 = e;
//
//        System.out.println(integer == integer2);  //wrapper로 비교를 할땐 == 로는 할수 없다. 근데 -127 ~ 127 까지는 가능한데 그 이유가 뭘까 ?
//        System.out.println(integer.equals(integer2));
//        System.out.println(integer == 1000);
//
////        int [] numbers = primes;
////        numbers[1] = 42;
////
//        for (int item : primes) {
//            System.out.println("primes : " + item);
//        }
////        for(int item : numbers){
////            System.out.println("numbers : "+item);
////
////        }
//
//        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
//        copiedPrimes[1] = 42;
//        for (int item : copiedPrimes) {
//            System.out.println("copiedPrimes : " + item);
//        }
//
//        String[] names2 = (String[]) freinds.toArray(new String[0]);
//        for (String item : names2) {
//            System.out.println(item);
//            System.out.println("z");
//        }
//
//        ArrayList<String> copiedFriends2 = new ArrayList<>(freinds);
//
//        copiedFriends2.add("fuck");
//
//        for (String item : freinds) {
//            System.out.println("friends : " + item);
//        }
//
//        for (String item : copiedFriends2) {
//            System.out.println("copiedFriends : " + item);
//
//        }
//
//        String[] names3 = {"a", "b", "c", "d"};
//
//        for (String item : names3) {
//            System.out.println("names3 : " + item);
//        }
//
//        ArrayList<String> friends = new ArrayList<>(List.of(names));
//
//
//        //page 78 의 note 부분 .
//        int[] intArray = {1, 2, 3, 4, 5};
//
//        //boxing, unboxing 처리 때문에 문제가 된다.
////        ArrayList<Integer> arrayList = new ArrayList<>(List.of(intArray));
//
//        //이 방식을 쓰거나.
//        ArrayList<Integer> arrayList = new ArrayList<>(intArray.length);
//        for (int item : intArray) {
//            arrayList.add(item);
//        }
//        for (Integer item : intArray) {
//            System.out.println("intArray  : "+item);
//        }
//
//
//        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.stream(intArray).boxed().collect(Collectors.toList()));
//        for (Integer item : arrayList1) {
//            System.out.println("intArray1 : "+item);
//        }
//
//        //배열 알고리즘
//        int[] fillInt = new int[]{4,5,2,34,1,24,5};
//        ArrayList<String> fillInteger = new ArrayList<>();
//        fillInteger.add("3");
//        fillInteger.add("2");
//        fillInteger.add("5");
////        Arrays.fill(fillInt,1);
////        Collections.fill(fillInteger, "hehet");
//        Arrays.parallelSort(fillInt);
//        Collections.sort(fillInteger);
//
//        for(int item : fillInt) {
//            System.out.println("fillInt : "+item);
//        }
//        for(String item : fillInteger) {
//            System.out.println("fillInteger : "+item);
//        }
//        Collections.shuffle(fillInteger);
//
//        System.out.println(Arrays.toString(fillInt));
//        System.out.println(fillInteger.toString());
//        System.out.println(fillInteger);
//
//        //파스칼 삼각형 만들기
//        int num1 = 10;
//        int[][] triangle = new int[num1][];
//
//        for (int i = 0; i < num1 ; i ++) {
//            triangle[i] = new int[i + 1];
//            triangle[i][0] = 1;
//            triangle[i][i] = 1;
//            for (int j = 1; j < i ; j ++) {
//                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
//            }
//        }
//
//        for (int i = 0 ; i < triangle.length ; i ++) {
//            for (int j = 0; j < triangle[i].length; j ++){
//                System.out.printf("%4d", triangle[i][j]);
//            }
//            System.out.println();
//        }
//
//        for (int[] row : triangle) {
//            for (int element : row) {
//                System.out.printf("%4d", element);
//            }
//            System.out.println();
//        }
//
//        average(1,2,3,4,5,6,7,8,9,10);
//
//        exit: {
//            System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");
//            System.out.println("4");
//            if (true) break exit;
//
//            System.out.println("5");
//        }
//        System.out.println("6");
//
//        String[] authors = {
//                "a",
//                "b",
//                "c",
//                "d"
//        };
//        System.out.println(Arrays.toString(authors));
//        System.out.println(authors.length);
//        authors[5] = "1";
        ArrayList<Integer> testa = new ArrayList<>();
        testa.add(1);

        String[] test12 = {"1","2","3","4","5"};
        List bb =  List.of("1","2","3","4","5");






        ArrayList<String > kk =  new ArrayList<>(List.of("1","2","3","4","5"));
        ArrayList<String > kk1 =  new ArrayList<>(bb);
//        ArrayList<String > kk2 =  new ArrayList<>(List.of(test12));
//        ArrayList<String > kk3 =  new ArrayList<>(List.of(new String[]{"!","@","3","$"}));
//
//        String[] names = new String[]{};
//        ArrayList<String> greinds = new ArrayList<>(List.of(names));
        String[] names = kk.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

        int a = 10 >>>1;
        System.out.println(true | false);
//        System.out.println(b);

//        Test test = new Test();
//        String e = "Hello";
//
//        System.out.println("Hello"==e);
//        System.out.println("Hello"==test.a);
//        System.out.println("Hello"==Test.b);
//        String heel = "Hello World";
//
//        System.out.println(heel.substring(0,5) == "Hello");
//        System.out.println(Integer.toString(10));
//
//        int codePoint = e.codePointAt(e.offsetByCodePoints(0,1));
//        System.out.println(codePoint);
//        int length = e.codePointCount(0,e.length());
//        System.out.println(length);

//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println(scanner.next());
//        }while(scanner.hasNext());

        System.out.printf("%d0", 10);
        switch ("ssa") {
            case "Hello" : System.out.println("ok");
            break;
            case "ss" : System.out.println("not");
            break;
            default: System.out.println("not at all");
        }

        String[] kkk = {"a","b","c"};
        ArrayList<String> arrayList = new ArrayList<>(List.of(kkk));
        kkk[1] = "2";
        String[] kks = arrayList.toArray(new String[0]);
        int [] array = {1,2,3};
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,2,3));
        arrayList1.forEach(System.out::println);


        Network network = new Network();
        network.new Member();

    }
    public static void average(double... values) {
        System.out.println(Arrays.toString(values));
    }
}
