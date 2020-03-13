package exercise.Ch4;

public class Manager extends Employee{
    private double bonus;
    private Manager manager;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager() {
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public Manager getSupervisor() {
        return this.manager;
    }




}
