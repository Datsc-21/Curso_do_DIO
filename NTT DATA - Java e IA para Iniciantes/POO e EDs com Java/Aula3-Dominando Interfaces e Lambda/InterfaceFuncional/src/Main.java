import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 17), new User("João", 20), new User("Danny", 21));

    printStringValue(Record::toString, users);
    

    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
       users.forEach( u ->  System.out.println(callback.apply(u)));
    }

}

