import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as temperaturas (0 para encerrar):");
        
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int contador = 0;
        
        while (true) {
            double temp = scanner.nextDouble();
            if (temp == 0) break;
            
            if (temp < menor) menor = temp;
            if (temp > maior) maior = temp;
            soma += temp;
            contador++;
        }
        
        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("Menor temperatura: %.1f\n", menor);
            System.out.printf("Maior temperatura: %.1f\n", maior);
            System.out.printf("Média das temperaturas: %.1f\n", media);
        } else {
            System.out.println("Nenhuma temperatura informada.");
        }
    }
}