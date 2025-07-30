import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        var value = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Marcia").
                filter(n -> n.endsWith("o")).
               allMatch(n -> n.contains("a"));


        System.out.println(value);
    }
}