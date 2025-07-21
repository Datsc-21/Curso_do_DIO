import java.time.Duration;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

   var stringStart = OffsetDateTime.now();

  String stringConcat = "";
  for(int i = 0; i < 1000; i++){
      stringConcat += i;
  }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String: %s \n", getInterval(stringStart, stringEnd));

        var BuilderStart = OffsetDateTime.now();
    var builderConcat = new StringBuilder();

  for (int i = 0; i < 1000; i++){
     builderConcat.append(i);
        }

        var BuilderEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder (singlethreed): %s \n", getInterval(BuilderStart, BuilderEnd));

        var BufferStart = OffsetDateTime.now();
     var bufferConcat = new StringBuffer();

  for( int i = 0; i < 1000; i++){
      bufferConcat.append(i);
  }
        var BufferEnd = OffsetDateTime.now();
  System.out.printf("StringBuffer (multihreed): %s \n", getInterval(BufferStart, BufferEnd));

    }

    private static long getInterval(OffsetDateTime stringStart, OffsetDateTime stringEnd) {
        return Duration.between(stringStart, stringEnd).toSeconds();
    }
}