import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    var value1 = Stream.generate(() -> new Random().nextInt()).
            limit(5).
            toArray(Integer[]::new);

    for(var v: value1){
        System.out.println(v);
    }

    System.out.println("======================");

    var value2 = IntStream.generate(() -> new Random().nextInt()).limit(5).toArray();

        for(var v: value1){
            System.out.println(v);
        }

    }
}