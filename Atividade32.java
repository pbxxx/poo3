import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] codigos = new int[5];
        int[] veiculos = new int[5];
        int[] acidentes = new int[5];
        double[] indices = new double[5];
        
        int totalVeiculos = 0;
        int totalAcidentesCidadesPequenas = 0;
        int cidadesPequenas = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nCidade " + (i+1));
            System.out.print("Código: ");
            codigos[i] = scanner.nextInt();
            System.out.print("Veículos de passeio (1999): ");
            veiculos[i] = scanner.nextInt();
            System.out.print("Acidentes com vítimas (1999): ");
            acidentes[i] = scanner.nextInt();
            
            indices[i] = (double) acidentes[i] / veiculos[i];
            totalVeiculos += veiculos[i];
            
            if (veiculos[i] < 2000) {
                totalAcidentesCidadesPequenas += acidentes[i];
                cidadesPequenas++;
            }
        }
        
        int indiceMaior = 0, indiceMenor = 0;
        for (int i = 1; i < 5; i++) {
            if (indices[i] > indices[indiceMaior]) indiceMaior = i;
            if (indices[i] < indices[indiceMenor]) indiceMenor = i;
        }
        
        System.out.println("\nResultados:");
        System.out.printf("Maior índice: Cidade %d (%.4f acidentes/veículo)\n", 
                         codigos[indiceMaior], indices[indiceMaior]);
        System.out.printf("Menor índice: Cidade %d (%.4f acidentes/veículo)\n", 
                         codigos[indiceMenor], indices[indiceMenor]);
        System.out.printf("Média de veículos: %.1f\n", (double) totalVeiculos / 5);
        
        if (cidadesPequenas > 0) {
            System.out.printf("Média de acidentes em cidades pequenas: %.1f\n", 
                             (double) totalAcidentesCidadesPequenas / cidadesPequenas);
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        }
    }
}