package exercise.Ch4.second;

public class Employee implements Cloneable{

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    protected int a;

    public Employee() {
    }

    public Employee(int a) {
        this.a = a;
    }

}
