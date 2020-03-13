package exercise.Ch4;


public class Student extends Person implements Named{
    private int id;

    public Student(String name, int id) { super(name);}

    @Override
    public int getId() {
        return this.id;
    }
}
