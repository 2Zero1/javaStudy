package exercise.Ch4;

public class Employee2 {
    private int id;

    public Employee2(int id) {
        this.id = id;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Employee2)) return false;
        Employee2 employee2 = (Employee2) obj;
        return id==employee2.id;
    }
}
