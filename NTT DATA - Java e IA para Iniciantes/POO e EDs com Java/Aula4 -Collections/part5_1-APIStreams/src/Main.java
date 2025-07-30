import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> debugValues = new ArrayList<>();
        var value = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Marcia").
                peek(debugValues::add).
                filter(name -> name.endsWith("a"))
                 .toList();

        System.out.println(debugValues);
        System.out.println(value);
    }
}