package exerciseproblem.ch2;
/*
Network 클래스 컴파일하자. 내부 클래스 파일의 이름이 Network$Member.class라는 것에 유의한다. 생성된 코드를 javap 프로그램으로 조사해보자(리눅스, macOS에서는 javap를 실행할 때 $ 기호 앞에 \를 붙여야한다.)
다음 명령은 메서드와 인스턴스 변수를 표시한다.

$ javap -private Classname

외부 클래스 참조는 어디에 있는가?

 */
public class No14 {
    /*javap -private Classname
    public class exercise.Ch2.Network$Member {
  private java.lang.String name;
  private java.util.ArrayList<exercise.Ch2.Network$Member> friends;
  final exercise.Ch2.Network this$0;
  public exercise.Ch2.Network$Member(exercise.Ch2.Network, java.lang.String);
  public void deactivate();
  public void deactivateWithInnerclass();
}

*/
    //외부 클래스 참조  final exercise.Ch2.Network this$0;

}
