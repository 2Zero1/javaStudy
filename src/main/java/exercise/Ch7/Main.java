package exercise.Ch7;

import exercise.Ch5.Test;
import exercise.Ch5.Test2;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    enum Weekday{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY} ;
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>(List.of("a", "b", "c"));
        Iterator<String> iter = coll.iterator();

        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
            if (element.equals("a"))
                iter.remove();
        }

        for (String element : coll) {

        }
        Iterator<String> iter2 = coll.iterator();
        while (iter2.hasNext()) {
            String element = iter2.next();
            System.out.println(element);

        }

        List<String> friends = new LinkedList<>();
        ListIterator<String> iterator = friends.listIterator();
        iterator.add("fred");
        iterator.add("wilma");
        iterator.previous();
        iterator.set("Barney");

        System.out.println(iterator.previous());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //set

        Set<String> badWords = new HashSet<>();
        badWords.add("sex");
        badWords.add("drug");
        badWords.add("c++");

        if (badWords.contains("sex".toLowerCase()))
            System.out.println("plz");

        //정렬된 집합 순회
        TreeSet<String> contries = new TreeSet<>();
        contries = new TreeSet<>((u, v) ->
                u.equals(v) ? 0
                        : u.equals("USA") ? -1
                        : v.equals("USA") ? 1
                        : u.compareTo(v));
        contries.add("HEM");
        contries.add("USA");
        contries.add("HEM1");
        Collection<String> coll2 = contries;


        Iterator<String> iterator1 = coll2.iterator();
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }
//        SortedSet<String> contry = contries.subSet("USA","HEM1");
//        System.out.println(contries.ceiling("USA"));
//        for (String iter3 : contries.headSet("HEM",true)) {
//            System.out.println(iter3);
//        }
        Map<String, Integer> counts = new HashMap<>();
        System.out.println("================");
        System.out.println(counts.put("Alice", 1));
        System.out.println(counts.put("Alice", 2));
        System.out.println(counts.put("Alice", 2));
        counts.put("Alice", null);
        int count = counts.getOrDefault("a",1);

        System.out.println(counts.merge("a",1,Integer::sum));
        System.out.println(counts.merge("a",1,Integer::sum));
        System.out.println(counts.merge("a",1,Integer::sum));

        counts.keySet().forEach(System.out::println);
        counts.entrySet().forEach(System.out::println);

        for (Map.Entry<String,Integer> item : counts.entrySet()){
            System.out.println(item.getKey());
        }
        counts.forEach((k, v) -> {

        });
        Properties settings = new Properties();
        settings.put("width", "200");
        settings.put("title", "Hello, World!");
//        settings.getProperty("title","default");

        Set<Weekday> always = EnumSet.allOf(Weekday.class);
        always.forEach(System.out::println);
        Set<Weekday> never = EnumSet.noneOf(Weekday.class);
        never.forEach(System.out::println);
        Set<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
        workday.forEach(System.out::println);
        Set<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.FRIDAY);
        mwf.forEach(System.out::println);


        //ArrayDequeue를 이용한 stack
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("peter");
        stack.push("peter2");
        stack.push("peter3");
        System.out.println(stack.pop());

        Queue<String> queue = new ArrayDeque<>();
        queue.add("peter");
        queue.add("peter1");
        queue.add("peter2");
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        PriorityQueue<Integer> nums = new PriorityQueue<>();
        nums.add(10);
        nums.add(9);
        nums.add(4);
        nums.add(12);
        nums.add(30);
        while(nums.size() > 0) {
            System.out.println(nums.remove());
        }

        WeakHashMap<Integer, String> hashMap = new WeakHashMap<>();
        hashMap.put(1,"a");
        hashMap.put(1,"b");
        hashMap.put(1,"c");

        Map<String, Integer> scores = Map.of("a",1);
        Map<String, Integer> scores2 = Map.ofEntries(Map.entry("a",1));
//        scores.put("a",2);
//        scores2.put("a",2);
//        scores.put("b",2);
        TreeSet<Integer> a = new TreeSet<>();
        a.add(4);
        a.add(2);
        a.add(3);
        a.add(1);
        a.forEach(System.out::println);

        ArrayList<String> arrayList = new ArrayList<>(List.of("a","b","c"));
        List<String> arrayList1 = Collections.unmodifiableList(arrayList);
//        arrayList1.add("b");
        Test test = new Test(new Test2());
        try{
            System.out.println("잉?");
            test.test();
        }catch (RuntimeException e) {
            e.toString();
            System.out.println(e.getMessage());

        }

    }

}
