import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Preço do pão: R$ ");
        double preco = scanner.nextDouble();
        
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d - R$ %.2f\n", i, preco * i);
        }
    }
}