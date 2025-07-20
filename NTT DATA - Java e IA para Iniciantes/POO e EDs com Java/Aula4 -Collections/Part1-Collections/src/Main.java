import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
int[] codes = {789, 852};
System.out.println(codes.length);
List<Integer> codes2 = new Vector<>();
codes2.add(codes[8]);
codes2.add(codes[1]);
codes2.forEach(System.out::println);
codes2.add(codes[74988]);
codes2.forEach(System.out::println);


    }
}