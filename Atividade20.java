import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas notas deseja calcular? ");
        int n = scanner.nextInt();
        double soma = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        
        double media = soma / n;
        System.out.println("Média das notas: " + media);
    }
}