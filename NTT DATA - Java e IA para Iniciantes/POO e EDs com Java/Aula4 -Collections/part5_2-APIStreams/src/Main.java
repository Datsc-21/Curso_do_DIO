import domain.Contact;
import domain.ContactType;
import domain.User;

import java.util.List;

import static domain.ContactType.EMAIL;

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

        


        return List.of();

    }
}