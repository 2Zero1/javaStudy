package exercise.Ch8;

import java.util.ArrayList;
import java.util.Optional;

public class Users {
    static ArrayList<User> users = new ArrayList<>();

    public static void add (User user) {
        users.add(user);
    }
    public static User classicLookup(String id) {
        if (users.stream().filter(v -> id.equals(v.getId())).findFirst().isPresent()){
            return users.stream().filter(v -> id.equals(v.getId())).findFirst().get();
        }
        return null;

    }
    public static Optional<User> lookup(String id) {
        return users.stream().filter(v -> id.equals(v.getId())).findFirst();

//        if (users.stream().filter(v -> id.equals(v)).findFirst().isPresent()){
//
//            return users.stream().filter(v -> id.equals(v)).findFirst();
//        }else{
//            return Optional.empty();
//        }
    }
}
