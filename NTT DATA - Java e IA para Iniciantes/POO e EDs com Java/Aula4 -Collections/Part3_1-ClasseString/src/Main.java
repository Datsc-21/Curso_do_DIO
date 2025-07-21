import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     var value = """
             {"name":"Danny","age":21}""";
        Map<String, String> map = new HashMap<>();
       value = value.replace("{", "").replace("}", "").replace("\"", "");
       var valueArr = value.split(",");
for(var v : valueArr){
    var KeyValue = v.split(":");
    map.put(KeyValue[0], KeyValue[1]);
}
System.out.println(map);

    }
}