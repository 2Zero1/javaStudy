package exercise.Ch4;

public class Employee implements Cloneable{
    protected double salary;
    private Manager manager;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void print(String a) {
        System.out.println(a);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name+", salary="+ salary +"]";
    }

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public void raiseSalary(double intVal) {
        this.salary += intVal;

    }

    public double getSalary() {
        return this.salary;
    }

    public final String getName() {
        return name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee getSupervisor() {
        return this.manager;
    }

}
