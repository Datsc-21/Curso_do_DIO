import domain.Contact;
import domain.ContactType;
import domain.User;

import java.util.ArrayList;
import java.util.List;

import static domain.ContactType.EMAIL;
import static domain.Sex.MALE;

public class Main {
    public static void main(String[] args) {

    }

    private static List<User> generateUsers(){
        var contacts1 = List.of(
                new Contact("", ContactType.PHONE),
                new Contact("", EMAIL)
        );

        var contacts2 = List.of(
                new Contact("", ContactType.PHONE),
                new Contact("", EMAIL)
        );

        var contacts3 = List.of(
                new Contact("", ContactType.PHONE),
                new Contact("", EMAIL)
        );

        var contacts4 = List.of(
                new Contact("", ContactType.PHONE),
                new Contact("", EMAIL)
        );

        var contacts5 = List.of(
                new Contact("", ContactType.PHONE),
                new Contact("", EMAIL)
        );

        var user1 = new User("", 0, MALE, new ArrayList<>(contacts1));
        var user2 = new User("", 0, MALE, new ArrayList<>(contacts2));
        var user3 = new User("", 0, MALE, new ArrayList<>(contacts3));
        var user4 = new User("", 0, MALE, new ArrayList<>(contacts4));
        var user5 = new User("", 0, MALE, new ArrayList<>(contacts5));



        return List.of(user1, user2, user3,user4, user5);

    }
}