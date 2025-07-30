import domain.User;

import java.util.Optional;

import static domain.SexEnum.FAMALE;

public class Main {
    public static void main(String[] args) {

        Optional<User> optional = Optional.of(new User("Danny", 21, FAMALE));
        System.out.println(optional.orElse(defaultUser()));

        



    }
}