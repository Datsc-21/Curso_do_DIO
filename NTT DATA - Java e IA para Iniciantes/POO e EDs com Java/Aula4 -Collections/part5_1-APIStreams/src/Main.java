import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        var value = Stream.of(1,2,3,4,5,6,7).
               map(n -> n % 2 == 0).toList();

        System.out.println(value);
    }
}