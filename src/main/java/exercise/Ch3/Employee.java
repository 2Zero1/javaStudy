package exercise.Ch3;

public class Employee implements Person, Identified{

    int id;
String a;
String [] b;


    public Employee( String a, int id) {
        this.id = id;
        this.a = a;
    }

    public Employee(String a) {
        this.a = a;
    }

    public Employee(String[] b) {
        this.b = b;
    }

    public Employee() {
    }

    @Override
    public String getName() {
        return a;
    }

    //Employee 클래스에 getId 메서드를 추가한 후 고유의 id 체계를 구현
    @Override
    public int getId() {
        return id;
    }
    // 또는 충돌한 메서드중 하나에 위임.
//    public int getId() { return Identified.super.getId();}        //super 키워드로 슈퍼타입의 메서드를 호출 가능.



}
