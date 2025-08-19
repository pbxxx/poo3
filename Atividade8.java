import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);
        int soma = 0;
        
        for (int i = inicio + 1; i < fim; i++) {
            soma += i;
        }
        
        System.out.println("Soma dos números no intervalo: " + soma);
        scanner.close();
    }
}