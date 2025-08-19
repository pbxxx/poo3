import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int fatorial = 1;
        
        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }
        
        System.out.println(n + "! = " + fatorial);
    }
}