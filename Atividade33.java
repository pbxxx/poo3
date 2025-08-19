import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor da dívida: R$ ");
        double divida = scanner.nextDouble();
        
        System.out.println("\nValor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0, 0.10, 0.15, 0.20, 0.25};
        
        for (int i = 0; i < parcelas.length; i++) {
            double valorJuros = divida * juros[i];
            double valorTotal = divida + valorJuros;
            double valorParcela = valorTotal / parcelas[i];
            
            System.out.printf("R$ %,.2f\tR$ %,.2f\t%d\t\tR$ %,.2f\n", 
                            valorTotal, valorJuros, parcelas[i], valorParcela);
        }
    }
}