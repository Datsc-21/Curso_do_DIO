import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        var user = new User(1, "Danny");
        users.add(user);
        users.add(new User(3, "Maria"));
        System.out.println(users.contains(user));
        System.out.println(users.size());
       System.out.println(users.isEmpty());
     // System.out.println(users.getFirst());
      //System.out.println(users.getLast());
       System.out.println(users.get(0));
      // System.out.println(users.getLast());
       System.out.println(users.get(users.size() -1));
    }
}