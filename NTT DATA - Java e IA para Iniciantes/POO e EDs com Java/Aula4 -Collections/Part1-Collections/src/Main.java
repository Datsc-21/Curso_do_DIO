import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        var user = new User(1, "Danny");
        users.add(user);
        users.add(new User(3, "Maria"));
        System.out.println(users.contains(user));
        System.out.println(users.contains(new User(1,"Maria")));
        System.out.println(new User(1, "Danny"));

    }
}