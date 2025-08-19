import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroMaisAlto = 0, numeroMaisBaixo = 0;
        double alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número do aluno: ");
            int numero = scanner.nextInt();
            System.out.print("Altura (cm): ");
            double altura = scanner.nextDouble();
            
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                numeroMaisAlto = numero;
            }
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                numeroMaisBaixo = numero;
            }
        }
        
        System.out.println("\nResultados:");
        System.out.printf("Aluno mais alto: Nº %d, %.1f cm\n", numeroMaisAlto, alturaMaisAlto);
        System.out.printf("Aluno mais baixo: Nº %d, %.1f cm\n", numeroMaisBaixo, alturaMaisBaixo);
    }
}