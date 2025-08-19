import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de CDs: ");
        int cds = scanner.nextInt();
        double total = 0;
        
        for (int i = 0; i < cds; i++) {
            System.out.print("Valor do " + (i+1) + "º CD: R$ ");
            total += scanner.nextDouble();
        }
        
        double media = total / cds;
        System.out.printf("Total investido: R$ %.2f\n", total);
        System.out.printf("Valor médio por CD: R$ %.2f\n", media);
    }
}