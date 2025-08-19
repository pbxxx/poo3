import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        double soma = 0.0;
        
        for (int i = 1; i <= n; i++) {
            int denominador = 2 * i - 1;
            double termo = (double) i / denominador;
            soma += termo;
            System.out.print(i + "/" + denominador);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        
        System.out.printf("\nSoma da série: %.2f\n", soma);
    }
}