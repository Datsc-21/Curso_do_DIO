import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        var value = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Marcia").
                peek(System.out::println).
                filter(name -> name.endsWith("a"));


        System.out.println(value);
    }
}