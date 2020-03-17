package exerciseproblem.ch4.No10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

//4.5.1 클래스 멤버 나열에서 다룬 MethodPrinter 프로그램을 사용해 int[] 클래스의 모든 메서드를 나열하라.
public class Main {
    public static void main(String[] args) {
        MethodPrinter(int[].class);
        try {
            Class<?> clas = Object.class.forName("[I");
            System.out.println(clas.getCanonicalName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void MethodPrinter(Class<?> clas) {
        System.out.println(clas.getCanonicalName());
        System.out.println();
        clas = Object.class;
        while(clas != null) {
            for (Method m : clas.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                                m.getReturnType().getCanonicalName() + " " +
                                m.getName() +
                                Arrays.toString(m.getParameters())
                );
            }
            clas = clas.getSuperclass();
        }
    }
}
