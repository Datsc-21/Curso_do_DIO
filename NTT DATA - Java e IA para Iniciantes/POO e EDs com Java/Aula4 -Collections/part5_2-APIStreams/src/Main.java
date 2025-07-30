import domain.Contact;
import domain.ContactType;
import domain.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static domain.ContactType.EMAIL;
import static domain.Sex.FEMALE;
import static domain.Sex.MALE;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>(generateUsers());

        var values = users.stream().
                filter(u -> u.contacts() != null && u.contacts().isEmpty()).
                toList();

values.forEach(System.out::println);

    }

    private static List<User> generateUsers(){
        var contacts1 = List.of(
                new Contact("(65)93234-4450", ContactType.PHONE),
                new Contact("andreia@gmail.com", EMAIL)
        );

        var contacts2 = List.of(
                new Contact("(65)92223-5545", ContactType.PHONE),
                new Contact("danny@gmail.com", EMAIL)
        );

        var contacts3 = List.of(
                new Contact("(65)98832-9978", ContactType.PHONE),
                new Contact("pedro@gmail.com", EMAIL)
        );

        var contacts4 = List.of(
                new Contact("(65)97722-3345", ContactType.PHONE),
                new Contact("luis@gmail.com", EMAIL)
        );

        var contacts5 = List.of(
                new Contact("(65)92223-1123", ContactType.PHONE),
                new Contact("maria@gmail.com", EMAIL)
        );

        var user1 = new User("Andreia", 30, FEMALE, new ArrayList<>(contacts1));
        var user2 = new User("Danny", 21, FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Pedro", 19, MALE, new ArrayList<>(contacts3));
        var user4 = new User("Luis", 19, MALE, new ArrayList<>(contacts4));
        var user5 = new User("Maria", 17, FEMALE, new ArrayList<>(contacts5));
        var user6 = new User("Bruna", 36, FEMALE, new ArrayList<>());



        return List.of(user1, user2, user3,user4, user5, user6);

    }
}