import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 17), new User("João", 20), new User("Danny", 21));
    var consumer = new Consumer<User>(){
        @Override
        public void accept(final User user){
     System.out.println(user);
        }
    };
        users.forEach(consumer);


    }
}