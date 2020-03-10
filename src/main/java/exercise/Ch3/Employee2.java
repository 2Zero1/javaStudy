package exercise.Ch3;

public class Employee2 implements Comparable<Employee2> {
    private int id = 1;
    private double salary = 0;

    public Employee2() {
    }

    public Employee2(int id) {
        this.id = id;
    }

    public Employee2(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Employee2 other) {
        return Double.compare(getSalary(),other.getSalary());
    }
    //    @Override
//    public int compareTo(Employee2 other) {
//        return getId() - other.getId(); //id가 항상 0 이상이라면 잘 작동함.
//    }
}
