package exerciseproblem.ch3.No1;

class Employee implements Measurable {

    String name;
    double salary = 0;

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
