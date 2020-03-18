package exercise.extraPackage;

import exercise.Ch4.Employee;
import exercise.Ch4.Janitor;

public class Test extends Employee {

    public void main(){
        Double salary = super.salary;
        Janitor janitor = new Janitor("a",11);
        Employee e = janitor;
    }
}
