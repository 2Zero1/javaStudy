package exercise.Ch4.second;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public enum Size{
        SMALL("S"), MEDIUM("B"), LARGE("L");
    private String abb;
    Size(String ab) {
        this.abb = ab;
    }

        public String getAbb() {
            return this.abb;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new int[]{2,2,3},new int[]{2,2,3}));
        System.out.println(Size.MEDIUM.getAbb());
        Object obj = new Employee();
        Class cls =  obj.getClass();
//        System.out.println(cls);

        Manager1 manager1 = new Manager1(1,2);
        for(Field a:manager1.getClass().getDeclaredFields()) {
            System.out.println(a.getName());
        }
        try {
            read("1");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void read(String filename ) throws IOException {
        try {
            System.out.println("1");
            System.out.println("2");
            throw new Exception();
        }catch (Exception e) {
            System.out.println("예외");
        }
    }

    public static Object goodCopyOf(Object array, int newLength) {
        Class<?> cl = array.getClass();
        Class<?> componentType = cl.getComponentType();
        int length = Array.getLength(array);
        Object arr =  Array.newInstance(componentType, length);
        for (int i = 0; i < Math.min(length, newLength); i++)
            Array.set(arr, i, Array.get(array, i));
        return arr;
    }
}
