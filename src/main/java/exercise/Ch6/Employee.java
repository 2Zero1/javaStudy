package exercise.Ch6;

public class Employee implements Comparable<Employee>{
    private int i;

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    public Employee(int i) {
        this.i = i;
    }

    public Employee() {
    }
}
