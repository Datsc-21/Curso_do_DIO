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

        users.forEach((k, v) -> System.out.printf("key: %s | value %s \n", k, v));
        System.out.println("==========================================");
        users.replace("deka@deka.com", new User("danny", 29));
        users.forEach((k, v) -> System.out.printf("key: %s | value %s \n", k, v));



    }
}