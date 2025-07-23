import java.util.function.BiFunction;

public enum OperadoraEnum {

    SUM(Integer::sum, "+"),

    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-"),

    MUTIPLY((Integer v1, Integer v2) -> v1 * v2, "*"),

    DIVISON((Integer v1, Integer v2) -> v1 / v2, "/");


    private final BiFunction<Integer, Integer, Integer> calculate;

    private final String symbol;

    OperadoraEnum(BiFunction<Integer, Integer, Integer> calculate, String symbol){
        this.calculate = calculate;
        this.symbol = symbol;
    }

    //O getter foi criado para nós ter acesso a ela.
    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }

    public String getSymbol() {
        return symbol;
    }
}
