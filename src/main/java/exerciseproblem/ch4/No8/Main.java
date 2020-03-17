package exerciseproblem.ch4.No8;

/*
 class 클래스에는 Class 객체로 나타내는 타입의 문자열 표현을 돌려주는 메서드가 여섯 개 있다. 배열, 제네릭 타입, 내부 클래스, 기본 타입에 이 메서들을
 적용하면 동작이 어떻게 달라지는가?
 */

public class Main {
    public static void main(String args[]) {
        print(int[].class);
        print(int.class);
        print(Outer.get().getClass());
        Entry<Integer,String> entry = new Entry<>(1,"aa");
        print(entry.getClass());
    }
    public static void print(Class<?> cl) {
        System.out.println("===================");
        System.out.println(cl.getCanonicalName());
        System.out.println(cl.getSimpleName());
        System.out.println(cl.getTypeName());
        System.out.println(cl.toString());
        System.out.println(cl.toGenericString());
        System.out.println(cl.getName());
    }
}
