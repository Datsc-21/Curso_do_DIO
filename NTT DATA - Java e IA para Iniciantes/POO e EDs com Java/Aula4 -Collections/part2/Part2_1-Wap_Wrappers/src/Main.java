import domain.User;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("danny@danny.com", new User("danny", 21));
        users.put("maria@,maria.com", new User("maria", 17));
        users.put("luis@luis.com", new User("luis", 19));
        users.put("mateus@mateus.com", new User("mateus", 18));

        System.out.println(users.containsKey("deka@deka.com"));
        System.out.println(users.containsValue(new User("deka", 21)));


    }
}