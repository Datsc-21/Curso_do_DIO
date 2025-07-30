import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        var value = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Marcia").
                filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(value);
    }
}