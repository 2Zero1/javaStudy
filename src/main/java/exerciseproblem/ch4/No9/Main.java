package exerciseproblem.ch4.No9;

import exercise.Ch4.Employee;

import java.lang.reflect.Field;

//리플렉션을 이용해 객체의 인스턴스 변수를 모두 포함하는 문자열을 만들어 내는 범용 toString 메서드를 작성하라.
public class Main {

    public static void main(String[] args) {
        object object = new object();
        Main main = new Main();
        Object o = object;
        System.out.println(main.toString(o));

    }
    public String toString(Object cl) {
        String result = cl.getClass().getSimpleName()+"'s variable = [";

        for (Field item : cl.getClass().getFields()) {
            result += item.getName()+" ";
        }
        result+="]";
        return result;

    }

}
