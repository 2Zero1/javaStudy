package exercise.Ch8;

import exercise.Ch3.Person;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String contents = null;
        String path = "/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exercise/Ch8/alice.txt";
        try {
            contents = new String(Files.readAllBytes(
                    Paths.get(path)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> words = List.of(contents.split("\\PL+"));

        words.stream().forEach(System.out::println);
        long count = words.stream()
                .filter(w -> w.length() > 12).count();

        Stream<String> words2 = Stream.of(contents.split("\\PL+"));

        Stream<String> song = Stream.of("gentle", "down", "the", "stream");


        Stream<String> silence = Stream.empty();

        Stream<String> echos = Stream.generate(() -> "Ech");

        Stream<Double> randoms = Stream.generate(Math::random);
        randoms.limit(2).forEach(System.out::println);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
//        integers.limit(10).forEach(System.out::println);

        BigInteger limit = new BigInteger("1000");
        Stream<BigInteger> integer
                = Stream.iterate(BigInteger.ZERO,
                n -> n.compareTo(limit) < 0,
                n -> n.add(BigInteger.ONE));

        integer.forEach(System.out::println);

        Stream<String> words3 = new Scanner(contents).tokens();
        words3.forEach(System.out::println);

        try (Stream<String> line = Files.lines(Paths.get("/Users/iyeonghan/YH/Often/project/coreJava9/src/main/java/exercise/Ch8/alice.txt"))) {
            line.forEach(System.out::print);
        }

        Stream<String> longWords = words.stream().filter(w -> w.length() > 12);
        longWords.forEach(System.out::println);

        Stream<String> upperCaseWords = words.stream().map(String::toUpperCase);
        upperCaseWords.forEach(System.out::println);

        Stream<String> firstLetters = words.stream().map(s -> s.substring(0, 1));
        firstLetters.forEach(System.out::println);


        Stream<Stream<String>> result = words.stream().map(w -> codePoints(w));
        words.stream().flatMap(w -> codePoints(w)).forEach(System.out::println);


        Stream<Double> randomss = Stream.generate(Math::random).limit(100);
        randomss.forEach(System.out::println);
        integers.skip(10).limit(10).forEach(System.out::println);

        System.out.println("================");
        Stream<String> initialDigits = codePoints("12as3df3").takeWhile(s -> "01234567890".contains(s));


        System.out.println("================");
        initialDigits.forEach(System.out::println);
        System.out.println("================");

        Stream<String> initialDigitss = codePoints("12as3df3").dropWhile(s -> "01234567890".contains(s));
        initialDigitss.forEach(System.out::println);

        System.out.println("================");
        Stream<String> combined = Stream.concat(
                codePoints("Hello"), codePoints("World"));

        combined.forEach(System.out::println);

        Stream<String> uniqueWords = Stream.of("merrily", "merrily", "merrily", "gently").distinct();
        uniqueWords.forEach(System.out::println);

        Stream<String> longestFirst = words.stream().sorted(Comparator.comparing(String::length).reversed());

        System.out.println("================");

        longestFirst.forEach(System.out::println);

        Object[] powers = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Fetching"+ e))
                .limit(20).toArray();

        Optional<String> largest = words2.max(String::compareToIgnoreCase);
        System.out.println("largest : "+ largest.orElse(""));

        words2 = Stream.of(contents.split("\\PL+"));

        System.out.println("=======");
        words2.forEach(System.out::println);

        words2 = Stream.of(contents.split("\\PL+"));

        Optional<String> startsWithQ = words2.filter(s -> s.startsWith("b")).findFirst();
        System.out.println("result : "+startsWithQ.orElse(""));

        words2 = Stream.of(contents.split("\\PL+")).parallel();

        Optional<String> startsWithQ1 = words2.filter(s -> s.startsWith("b")).findFirst();
        System.out.println("result : "+startsWithQ1.orElse(""));

        words2 = Stream.of(contents.split("\\PL+")).parallel();
        words2.anyMatch(s -> s.startsWith("b"));

        String result2 = startsWithQ.orElse("");
        System.out.println(result2);

        result2 = startsWithQ.orElseThrow(IllegalStateException::new);

        startsWithQ = Optional.empty();
        Optional<String> result3 = startsWithQ.or(() -> Optional.ofNullable(null));
        System.out.println(result3.orElse("hi"));

        Optional<String> optionalValue = Optional.of("hahaha");
        optionalValue.ifPresent(v -> System.out.println(v));

        ArrayList<String> arrayList = new ArrayList<>();
        optionalValue.ifPresent(arrayList::add);
        System.out.println("======");
        arrayList.forEach(System.out::println);
        Optional<String> empty = Optional.empty();
        empty.ifPresentOrElse(System.out::println, () -> System.out.println("hello"));

        Optional<Boolean> added = optionalValue.map(arrayList::add);
        System.out.println(added.get());

        Test s = new Test();
        s.f().flatMap(TType::g);
        System.out.println(squareRoot(10.0));
        System.out.println(inverse(10.0).flatMap(Main::squareRoot));

        Users users = new Users();
        Users.add(new User("1"));
        Users.add(new User("2"));
        Users.add(new User("3"));
        Users.add(new User("4"));
        Stream<String> ids = Stream.of("1","2","3");
        System.out.println("======");
        Stream<User> users2 = ids.map(Users::lookup).filter(Optional::isPresent).map(Optional::get);
        users2.forEach(v -> System.out.println(v.getId()));
        ids = Stream.of("1","2","3");
        Stream<User> users3 = ids.map(Users::lookup)
                .flatMap(Optional::stream);

        users3.forEach(v -> System.out.println(v.getId()));

        ids = Stream.of("1","2","3","9");

//        Stream<User> users11 = ids.map(Users::classicLookup).filter(Objects::nonNull);
//        Stream<User> users12 = ids.flatMap(id -> Stream.ofNullable(Users.classicLookup(id)));
//        Stream<User> users13 = ids.map(Users::classicLookup).flatMap(Stream::ofNullable);


        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        String[] strings1 = strings.stream().toArray(String[]::new);
//        for (String item : strings1){
//            System.out.println(item);
//        }

        List<String> resultss = strings.stream().collect(Collectors.toList());
        resultss.forEach(System.out::println);

        Set<String> sets = strings.stream().collect(Collectors.toSet());
        Set<String> sets2 = strings.stream().collect(Collectors.toCollection(TreeSet::new));
        String resultstring = strings.stream().collect(Collectors.joining(", "));
        System.out.println(resultstring);

        String resultstring2 = strings.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(resultstring);
        IntStream aaa = IntStream.of(1,2,3);

        IntSummaryStatistics summary = strings.stream().collect(
                Collectors.summarizingInt(String::length)
        );
        double averageWordLength = summary.getAverage();
        System.out.println(summary.getMax());

        Stream<User> people = Stream.of(new User("hi",1),new User("Hey",2));
        Map<Integer, String> idToName = people.collect(Collectors.toMap(User::getAge, User::getId));
        System.out.println(idToName.get(1));
        people = Stream.of(new User("hi",1),new User("Hey",2));
        Map<Integer, User> idToUser = people.collect(Collectors.toMap(User::getAge, Function.identity()));
        System.out.println(idToUser.get(1).getId());

        //동일한 키가 여러개 일 경우.
        people = Stream.of(new User("hi",1),new User("hi2",1));
        Map<Integer, User> idToUser1 = people.collect(Collectors.toMap(User::getAge, Function.identity(), (a, b) -> b));
        System.out.println(idToUser1.get(1).getId());
        people = Stream.of(new User("hi",1),new User("hi2",1));


        Map<Integer, Set<String>> countryLanguageSets = people.collect(
                Collectors.toMap(User::getAge, l -> Collections.singleton(l.getId()), (a, b) -> {
                    Set<String> union = new HashSet<>(a);
                    union.addAll(b);
                    return union;
                })
        );
        System.out.println(countryLanguageSets.get(1));

        people = Stream.of(new User("hi",1),new User("hi2",1));
        Map<String, User> idToUser2 = people.collect(
                Collectors.toMap(
                        User::getId,
                        Function.identity(),
                        (a,b) -> {throw new IllegalStateException();},
                        TreeMap::new));

        idToUser.forEach((a,b) -> System.out.println(a));
        people = Stream.of(new User("hi",1),new User("hi2",1));

        Map<Integer, List<User>> maps = people.collect(Collectors.groupingBy(User::getAge));
        System.out.println(maps.get(1).get(0).getId());
        System.out.println(maps.get(1).get(1).getId());

        people = Stream.of(new User("hi",1),new User("hi2",1));
        Map<Boolean, List<User>> test2 = people.collect(
                Collectors.partitioningBy(l -> l.getId().equals("hi"))
        );

        List<User> tests = test2.get(true);
        tests.forEach(v -> System.out.println(v.getId()+"hey"));

        //다운스트림 컬렉터
        people = Stream.of(new User("hi",1),new User("hi2",1));
        Map<Integer, Set<User>> sets3 = people.collect(Collectors.groupingBy(User::getAge,Collectors.toSet()));

        people = Stream.of(new User("hi",1),new User("hi2",1));
        Map<Integer, Integer> sum = people.collect(Collectors.groupingBy(User::getAge, Collectors.summingInt(User::getAge)));
        System.out.println(sum.get(1));
        people = Stream.of(new User("hi",1),new User("hi",2),new User("hi",3),new User("hi",4));
        Map<Integer, Set<String>> usersss = people.collect(Collectors.groupingBy(User::getAge,
                Collectors.mapping(User::getId, Collectors.toSet())));
        System.out.println();
        usersss.get(1).forEach(System.out::println);
        people = Stream.of(new User("hi",1),new User("hi",2),new User("hi",3),new User("hi",4));

        List<Integer> values = List.of(1,2,3,4,5);
        values.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        values.stream().reduce(0, (x, y) -> x + y);
        people = Stream.of(new User("hi",1),new User("hi",2),new User("hi",3),new User("hi",4));
        System.out.println(people.mapToInt(User::getAge).sum());

        Stream<Integer> integerStream = values.parallelStream();
        Stream<Integer> integerStream2 = Stream.of(1,2,3,4).parallel();

        int[] shortWords = new int[12];
        Stream<String> stringStream = Stream.of("a","aaaaaaaa","aaaaaaaaasfasfdadfdsaf","aasdfasdfasd","aaaaaaaaasfasfdadfdsaf","aaaaaaaaasfasfdadfdsaf","aaaaaaaaasfasfdadfdsaf","aaaaaaaaasfasfdadfdsaf","aaaaaaaaasfasfdadfdsaf","aaaaaaaaasfasfdadfdsaf","aaaaaaaaasfasfdadfdsaf");
        stringStream.parallel().forEach(a -> { if (a.length() < 12) shortWords[a.length()]++;});
        System.out.println(Arrays.toString(shortWords));

        List<String> friends = new LinkedList<>();
//        friends.add("a");
//        friends.add("b");
        ListIterator<String> iter1 = friends.listIterator();
        ListIterator<String> iter2 = iter1;
        iter1.add("a");
        iter2.add("b");
        iter1.previous();
        iter1.previous();
        iter2.set("c");
        iter1.forEachRemaining(System.out::println);

        List<String> copiedFriends  = friends.subList(0,1);
        copiedFriends.add(0,"Asdf");
        friends.forEach(System.out::println);

//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1,"hi");
//        hashMap.put(2,"hello");
//        hashMap.put(3,"namaste");
//        hashMap.compute(1,(k,v) -> v+"hello");
//        hashMap.put(4,null);
//        System.out.println(hashMap.get(1));
//        System.out.println(hashMap.get(4));
//        hashMap.computeIfAbsent(4,v -> "setting");
//        System.out.println(hashMap.get(4));
//        hashMap.computeIfPresent(4,(k,v) -> null);
//        System.out.println(hashMap.get(4));
//        hashMap.replaceAll((k,v) -> null);
//        hashMap.entrySet();
//        hashMap.values();

        List<String> array = new ArrayList<>();
        array.add("나");
        array.add("가");

        array.add("다");
        Stream<String> stream = array.stream();
        array.add("라");
        stream.forEach(System.out::println);
        Object a = null;
        Optional.ofNullable(a).ifPresentOrElse(v -> System.out.println(v), () -> System.out.println("없음"));

        words.stream().mapToInt(v -> v.length()).summaryStatistics();

    }

    public static Optional<Double> squareRoot(Double x) {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }

    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }

    public static Stream<String> codePoints(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while ( i < s.length()) {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i = j;
        }
        return result.stream();
    }
}
