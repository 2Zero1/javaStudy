package exercise.Ch8;

public class User {
    String id;
    int age;

    public User(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }
}
