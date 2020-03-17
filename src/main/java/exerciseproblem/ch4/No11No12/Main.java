package exerciseproblem.ch4.No11No12;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clas = Class.forName("java.lang.System");

        long start = System.currentTimeMillis();
        Field field = clas.getField("out");
        Method method = field.getType().getMethod("println", String.class);
        method.invoke(System.out,"hello");
        long end = System.currentTimeMillis();
        System.out.println("첫번째 : "+(end - start));


        long start1 = System.currentTimeMillis();
        Class<?> clas2 = System.out.getClass();
        Method method1 =  clas2.getMethod("println", String.class);
        method1.invoke(System.out, "hallo");
        long end1 = System.currentTimeMillis();
        System.out.println("첫번째 : "+(end1 - start1));

        long start2 = System.currentTimeMillis();
        System.out.println("hello");

        long end2 = System.currentTimeMillis();
        System.out.println("첫번째 : "+(end2 - start2));


    }
}
