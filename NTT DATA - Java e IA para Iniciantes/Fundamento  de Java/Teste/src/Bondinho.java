import java.util.Scanner;
public class Bondinho {
    public static void main(String[] args) {
        // Seu código vai aqui
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if( A >= 1 && A <= 50  && B <= A){
            System.out.println("S");
        }else if(B <= A){
            System.out.println("N");
        }else{
            System.out.println("S");
        }


    }
}
