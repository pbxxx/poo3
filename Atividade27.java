import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nLojas Tabajara");
            double total = 0;
            int item = 1;
            
            while (true) {
                System.out.printf("Produto %d: R$ ", item);
                double valor = scanner.nextDouble();
                if (valor == 0) break;
                total += valor;
                item++;
            }
            
            System.out.printf("Total: R$ %.2f\n", total);
            System.out.print("Dinheiro: R$ ");
            double dinheiro = scanner.nextDouble();
            System.out.printf("Troco: R$ %.2f\n", dinheiro - total);
        }
    }
}