package exerciseproblem.ch4.No13;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
double 또는 Double 타입 매개변수를 받는 정적 메서드를 나타내는 Method 값들을 표로 출력하는 메서드를 작성하라. Method 객체 외에도 하한, 상한, 증감,
크기를 받도록 만들어라. 이 메서드로 Math.sqrt와 Double.toHexString의 값들을 표로 출력하는 예를 보여라.Method 대신 DoubleFuction<Object>
를 사용해 풀이를 반복하라(3.6.2 함수형 인터페이스 선택 참고). 두 접근법의 안정성, 효율성, 편의성을 비교하라.
 */
public class Main {
    public final static int PUBLIC_STATIC = 9;
    public static void main(String[] args) {
        get(Math.class);
        get(Double.class);

    }
    public static void get(Class<?> clas) {
        for(Method method : clas.getMethods()) {
            Class<?>[] types = method.getParameterTypes();
            String name = method.getName();
//            System.out.println(Modifier.toString(method.getModifiers()));
//            System.out.println(method.getModifiers());
            if (method.getModifiers() == PUBLIC_STATIC && types.length == 1 && (types[0].equals(double.class) || types[0].equals(Double.class))) {

                System.out.println(
                        Modifier.toString(method.getModifiers()) + " " +
                                method.getReturnType().getCanonicalName() + " " +
                                method.getName() +
                                Arrays.toString(method.getParameters()));
            }
        }
    }
}
