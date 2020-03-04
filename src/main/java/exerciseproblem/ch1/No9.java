package exerciseproblem.ch1;

public class No9 {

// 9. 1.5.3 문자열 비교에는 s.equals(t) 이지만 s!=t인 두 문자열 s와 t를 비교하는 예제가 있다. substring을 사용하지 않는 다른 예를 제시하라.
    public static void main(String[] args) {
        String a = "test";
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        System.out.println(a == "test");
        System.out.println(a.equals("test"));
        System.out.println(a==builder.toString());

    }
}
