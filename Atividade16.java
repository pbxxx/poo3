import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números deseja digitar? ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Nenhum número para processar.");
            return;
        }
        
        System.out.print("Digite o 1º número: ");
        double primeiro = scanner.nextDouble();
        double menor = primeiro;
        double maior = primeiro;
        double soma = primeiro;
        
        for (int i = 1; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            double num = scanner.nextDouble();
            if (num < menor) menor = num;
            if (num > maior) maior = num;
            soma += num;
        }
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
    }
}