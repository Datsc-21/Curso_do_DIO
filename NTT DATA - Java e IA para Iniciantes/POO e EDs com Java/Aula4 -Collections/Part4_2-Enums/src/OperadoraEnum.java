import java.util.function.BiFunction;

public enum OperadoraEnum {

    SUM(Integer::sum),

    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2),

    MUTIPLY((Integer v1, Integer v2) -> v1 * v2),

    DIVISON((Integer v1, Integer v2) -> v1 / v2);


    private final BiFunction<Integer, Integer, Integer> calculate;

    OperadoraEnum(BiFunction<Integer, Integer, Integer> calculate){
        this.calculate = calculate;
    }
}
