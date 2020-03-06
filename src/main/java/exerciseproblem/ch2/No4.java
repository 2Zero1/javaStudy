package exerciseproblem.ch2;

import org.omg.CORBA.IntHolder;

// 자바에서는 왜 두 int변수의 내용을 맞바꾸는 메서드를 구현할 수 없는가? 그 대신 두 IntHolder의 내용을 맞바꾸는 메서드를 작성하라.(API 문서에 잘 알려지지 않은 IntHolder 클래스를 찾아보자.)
// 두 Integer 객체의 내용을 맞바꿀 수 있는가?
public class No4 {
    //int 변수의 내용을 맞바꾸는 메서드를 구현할 수 없는가 ? 메서드에 전달된 int 변수들의 값들이 메서드에서 받는 변수들에 값이 복사되기 때문이다. 그렇기 때문에
    // 바꾸더라도, 유효범위가 메서드 안에서만 인정되기 때문이다.

   public static void main(String[] args) {

       Integer a = 1 , b = 2;
       System.out.println(a+""+b);
       swap(a,b);
       System.out.println(a+""+b);
//       new IntHolder();
//       IntHolder holdera = new IntHolder(1);
//       IntHolder holderb = new IntHolder(2);
//       swap(holdera,holderb);
   }

//   public static void swap(IntHolder a, IntHolder b) {
//       System.out.println(a);
//       System.out.println(b);
//   }

   //Integer로도 두 객체의 내용을 바꿀 순 없다. a, b에는 메서드를 사용할 때 새로운 변수 a,b를 만들어 a,b의 참조 값을 복사하였고, 이게 바뀌더라도 유효는 메서드가 끝날때 까지만 가능하다.
   public static void swap(Integer a, Integer b) {
       Integer tmp = a;
       a = b;
       b = tmp;
       System.out.println(a+""+b);

   }


}
