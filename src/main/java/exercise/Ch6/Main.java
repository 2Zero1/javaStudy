package exercise.Ch6;


import exercise.Ch4.Employee;
import exercise.Ch4.Manager;

import java.io.Closeable;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {
        Entry<String, Integer> entry = new Entry<>("1",1);
        String[] friends = new String[]{"1","2","3"};
        Arrays.<String>swap(friends, 1, 0);
        for (String a : friends) {
            System.out.println(a);
        }
        ArrayList<PrintStream> printStreams = new ArrayList<>();
//        closeAll2(printStreams);
//        closeAll(printStreams);
        PrintStream[] printStreams1 = new PrintStream[]{};
//        closeAll3(printStreams1);

        genericConcret genericConcret = new genericConcret();
        genericTest genericTest = genericConcret;

        genericConcret[] genericConcrets = new genericConcret[]{};
        genericTest[] genericTests = genericConcrets;




        PrintStream printStream = new PrintStream(System.out);
        Closeable closeable = printStream;


        Closeable[] closeables = printStreams1;

        Manager[] managers = new Manager[3];
        Employee[] employees = managers;
        employees = managers;
        employees[0] = new Manager("nam",10000000);
        employees[1] = new Manager("name",200000000);
        employees[2] = new Manager("name2",2000000000);
        Manager[] managers1 = (Manager[]) employees;
        for (Manager employee : managers1){
            System.out.println(employee.getName());
        }

        printAll2(employees, (v) -> v.getName().equals("name"));

//        for (Manager employee : (Manager[]) employees){
//            System.out.println(employee.getName());
//        }

//        ArrayList<Employee> arrayList = new ArrayList<>(List.of(employees));
//        printNames(arrayList);

//        printAll(employees, e -> e.getSalary() > 10000);
//        printAll(employees, e -> e.getName().length() > 3);
//
//
//        SuperInterface superInterface = new SuperInterface() {
//            @Override
//            public Object test() {
//                return null;
//            }
//        };
//
//        SubInterface subInterface = new SubInterface() {
//            @Override
//            public String test() {
//                return null;
//            }
//        };

        //인터페이스는 불변
//        superInterface  = subInterface;
        ArrayList<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee("name3",3));
        employees1.add(new Employee("name1",1));
        employees1.add(new Employee("name2",2));
        Collections.sort(employees1);
        employees1.forEach(System.out::println);

        Entry<String, Integer> entry1 = new Entry<>("s",1);
        String key = entry1.getKey();

//        Object result = new ArrayList<>(List.of(1,2,3));
//        ArrayList<String> list = (ArrayList<String>) result;
//        for (String i :list) {
//            System.out.println(i);
//        }

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Employee> arrayList1 = new ArrayList<>();

        //왜 안되는지 모르겠음.
//        @SuppressWarnings("unchecked")arrayList = arrayList1;
        for (String item : repeat(10, "Hi", String.class)) {
            System.out.println(item);
        }
        Entry<String, Integer>[] a = (Entry<String, Integer>[]) new Entry<?,?>[100];

        Entry<String, Integer> entry2 = new Entry<>("a",1);
        Entry<String, Integer> entry3 = new Entry<>("b",2);
        ArrayList<Entry<String, Integer>> entries = asList(entry2, entry3);

        entries.forEach(x -> { System.out.println(x.getKey());});

        exercise.Ch6.Employee.class.getConstructor().newInstance();

    }



    public static <T> ArrayList<T> asList(T... elements) {
        ArrayList<T> result = new ArrayList<>();
        for (T e : elements) result.add(e);
        return result;
    }

    public static <T> T[] repeat(int n, T obj, T[] array) {
        T[] result;
        if (array.length >= n)
            result = array;
        else{
            T[] newArray = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), n);
            result = newArray;
        }
        for (int i = 0; i < n; i ++) result[i] = obj;
        return result;
    }

//    public static <T> ArrayList<T> repeat(int n, T obj) {
//        ArrayList<T> result = new ArrayList<>();
//        for (int i = 0; i < n; i ++) result.add(obj);
//        return result;
//    }

//    class ArrayList<E> {
//        private Object[] elementData;
//
//        public E get(int index) {
//            return (E) elementData[index];
//        }
//    }

    //타입 변수는 T(...) 또는 new T[..] 같은 표현식에 사용할 수 없다.
//    public static <T> T[] repeat(int n, T obj) {
//        T[] result = new T[n];
//        for (int i = 0; i < n; i ++) result[i] = obj;
//        return result;
//    }

    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i = 0; i < n; i++) {
            result[i] = obj;
        }
        return result;
    }

    public static <T> T[] repeat(int n, T obj, Class<T> cl) {
        T[] result = (T[]) java.lang.reflect.Array.newInstance(cl,n);
        for (int i = 0; i < n; i ++) result[i] = obj;
        return result;
    }

    public static <T extends Comparable<T>> void sort(List<T> list) {

    }

    public static <T> void printAll2(T[] elements, Predicate<T> filter) {
        for (T e : elements)
            if (filter.test(e))
                System.out.println("hehet"+e.toString());
    }

    public static <T> void printAll(T[] elements, Predicate<? super T> filter) {
        for (T e : elements)
            if (filter.test(e))
                System.out.println(e.toString());
    }


    public static void printAll(Employee[] staff, Predicate<Employee> filter) {
        for (Employee e : staff)
            if(filter.test(e))
                System.out.println(e.getName());

    }

    public static void printNames(ArrayList<? extends Employee> staff) {
        for (int i = 0; i < staff.size(); i++) {
            Employee e = staff.get(i);
            System.out.println(e.getName());
        }
    }

    public static void closeAll3(Closeable[] elems) throws Exception {
        for (Closeable elem : elems) elem.close();
    }
//    public static void closeAll2(ArrayList<Closeable> elems) {
//        for (Closeable elem : elems) elem.close();
//    }

    public static <T extends Runnable & AutoCloseable & Test & Consumer> void closeAll(ArrayList<T> elems) throws Exception{
    for (T elem : elems) elem.close();
    }


}
