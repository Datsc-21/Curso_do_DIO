import java.util.Scanner;
import java.util.Locale;

public class EcommerceSpendingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            // TODO: Leia os valores das compras e calcule a média
            for(int i = 0; i < purchaseCount; i++ ){
                double n =  scanner.nextDouble();
                totalSpent += n;
            }

            double media = totalSpent / purchaseCount;

            System.out.printf("%.2f%n", totalSpent);
            System.out.printf("%.2f%n", media); // TODO: Imprima a média
        }

        scanner.close();
    }
}