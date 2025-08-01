import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
      new FileOutputStream("");
        test();
        System.out.println("Terminou");
    }

    private static void test() {
                       new Throwable(); // pai de exceptions e erros
                          /       \
         new Exception(); new Error();  //erros
                     /                 \
   new RuntimeException(); // Unchechecked  new FileNotFoundException();
        //throw new RuntimeException();
    }
}