import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas na turma? ");
        int n = scanner.nextInt();
        int soma = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            soma += scanner.nextInt();
        }
        
        double media = (double) soma / n;
        System.out.printf("Média de idade: %.1f\n", media);
        
        if (media <= 25) {
            System.out.println("Turma jovem");
        } else if (media <= 60) {
            System.out.println("Turma adulta");
        } else {
            System.out.println("Turma idosa");
        }
    }
}