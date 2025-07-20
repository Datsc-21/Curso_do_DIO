import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(1, "Danny"));
        users.add(new User(2, "Taise"));
        users.add(new User(3, "Pedro"));
        users.add(new User(4, "Luis"));
    }
}