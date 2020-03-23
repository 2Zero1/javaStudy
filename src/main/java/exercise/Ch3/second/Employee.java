package exercise.Ch3.second;

public class Employee implements Comparable<Employee>{
    public Employee(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }

    private int id;

    public int getId() {
        return id;
    }
}
