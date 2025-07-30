import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        var value = Stream.of("Maria", "João", "Marcio", "Luana", "Leandro", "Marcia").
               reduce("", (a,b) -> a + b + ";" );

        System.out.println(value);
    }
}