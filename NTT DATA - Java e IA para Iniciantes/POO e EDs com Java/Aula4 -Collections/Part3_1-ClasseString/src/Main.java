import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     var value = """
             {"name":"Danny","age":21}
             """;
        Map<String, String> map = new HashMap<>();
        while(map.size() != 2){
            var starKeyIndex = value.indexOf("\"");
            var endKeyIndex = value.indexOf("\":");
            var keyValue = value.substring(starKeyIndex + 1, endKeyIndex);

            var startValueIndex = value.indexOf(":\"");
            var endValueIndex = value.indexOf("\":", startValueIndex);
            var valueKey = value.substring(starKeyIndex + 1, endValueIndex);
            map.put(keyValue, valueKey);

        }
System.out.println(map);

    }
}