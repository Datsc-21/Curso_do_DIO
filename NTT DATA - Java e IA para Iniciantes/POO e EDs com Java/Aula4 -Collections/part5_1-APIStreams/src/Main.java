import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

List<Integer> value1 = List.of(3,6,9,12);
List<Integer> value2 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

var newValues = value2.stream()
        .filter(value1::contains)
        .peek(n -> System.out.printf("Filter %s \n", n))
        .map(n -> value1.stream().reduce(n, (n1,n2) -> n1 -n2))
        .peek(n -> System.out.printf("Map %s \n", n))
        .collect(Collectors.toSet());

        System.out.println(newValues);
    }
}