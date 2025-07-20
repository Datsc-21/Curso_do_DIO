import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User(2, "Danny"));
        users.add(new User(1, "Taise"));
        users.add(new User(4, "Pedro"));
        users.add(new User(3, "Luis"));

        System.out.println(users);
        }
    }
