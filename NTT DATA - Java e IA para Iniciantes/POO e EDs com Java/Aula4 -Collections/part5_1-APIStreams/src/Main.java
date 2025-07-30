import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        var value = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Marcia").
                filter(name -> name.endsWith("o"))
                .limit(2)
                 .toList();

        System.out.println(value);
    }
}