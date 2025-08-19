import java.util.Scanner;
import java.util.ArrayList;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();
        ArrayList<Integer> primos = new ArrayList<>();
        int totalDivisoes = 0;
        
        for (int num = 2; num <= n; num++) {
            int divisoes = 0;
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                divisoes++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            totalDivisoes += divisoes;
            if (primo) {
                primos.add(num);
            }
        }
        
        System.out.println("Números primos entre 1 e " + n + ": " + primos);
        System.out.println("Total de divisões realizadas: " + totalDivisoes);
    }
}