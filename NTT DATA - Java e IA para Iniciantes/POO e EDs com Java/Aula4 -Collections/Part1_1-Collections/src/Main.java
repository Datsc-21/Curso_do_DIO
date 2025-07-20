import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(1, "Danny"));
        users.add(new User(2, "Taise"));
        users.add(new User(3, "Pedro"));
        users.add(new User(4, "Luis"));

        System.out.println(users.contains(new User(1, "Danny")));

        users.removeAll(List.of(new User(1, "Danny"), new User(2, "Taise")));

        System.out.println(users);
        }
    }
