import java.util.Scanner;
public class Areadoquadrado {
    public static void main(String[] args) {
        // Seu código vai aqui
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        double quadrado = Math.pow(num, 2);
        System.out.println(quadrado);

    }
}
