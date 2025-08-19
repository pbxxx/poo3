import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        
        System.out.println("Cardápio:");
        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simples - R$ 1,30");
        System.out.println("102 - Bauru com ovo - R$ 1,50");
        System.out.println("103 - Hambúrguer - R$ 1,20");
        System.out.println("104 - Cheeseburguer - R$ 1,30");
        System.out.println("105 - Refrigerante - R$ 1,00");
        System.out.println("0 - Encerrar pedido");
        
        while (true) {
            System.out.print("\nCódigo do item (0 para encerrar): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) break;
            
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            
            double preco = 0;
            String item = "";
            
            switch (codigo) {
                case 100: preco = 1.20; item = "Cachorro Quente"; break;
                case 101: preco = 1.30; item = "Bauru Simples"; break;
                case 102: preco = 1.50; item = "Bauru com ovo"; break;
                case 103: preco = 1.20; item = "Hambúrguer"; break;
                case 104: preco = 1.30; item = "Cheeseburguer"; break;
                case 105: preco = 1.00; item = "Refrigerante"; break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }
            
            double subtotal = preco * quantidade;
            total += subtotal;
            System.out.printf("%s: %d x R$ %.2f = R$ %.2f\n", item, quantidade, preco, subtotal);
        }
        
        System.out.printf("\nTotal do pedido: R$ %.2f\n", total);
    }
}