import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double maisAlto = 0, maisBaixo = Double.MAX_VALUE;
        double maisGordo = 0, maisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int clientes = 0;
        
        while (true) {
            System.out.print("Código do cliente (0 para encerrar): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) break;
            
            System.out.print("Altura (cm): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            
            if (altura > maisAlto) {
                maisAlto = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
                codigoMaisBaixo = codigo;
            }
            if (peso > maisGordo) {
                maisGordo = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < maisMagro) {
                maisMagro = peso;
                codigoMaisMagro = codigo;
            }
            
            somaAlturas += altura;
            somaPesos += peso;
            clientes++;
        }
        
        if (clientes > 0) {
            System.out.println("\nResultados:");
            System.out.printf("Mais alto: Código %d, %.1f cm\n", codigoMaisAlto, maisAlto);
            System.out.printf("Mais baixo: Código %d, %.1f cm\n", codigoMaisBaixo, maisBaixo);
            System.out.printf("Mais gordo: Código %d, %.1f kg\n", codigoMaisGordo, maisGordo);
            System.out.printf("Mais magro: Código %d, %.1f kg\n", codigoMaisMagro, maisMagro);
            System.out.printf("Média de altura: %.1f cm\n", somaAlturas/clientes);
            System.out.printf("Média de peso: %.1f kg\n", somaPesos/clientes);
        } else {
            System.out.println("Nenhum cliente registrado.");
        }
    }
}