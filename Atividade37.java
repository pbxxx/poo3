import java.util.Scanner;

public class Atividade37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};
        int maiorAcerto = 0, menorAcerto = 10;
        int totalAlunos = 0, totalAcertos = 0;
        
        while (true) {
            System.out.println("\nAluno " + (totalAlunos+1));
            int acertos = 0;
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Resposta da questão " + (i+1) + ": ");
                char resposta = scanner.next().toUpperCase().charAt(0);
                if (resposta == gabarito[i]) {
                    acertos++;
                }
            }
            
            System.out.println("Acertos: " + acertos);
            totalAcertos += acertos;
            totalAlunos++;
            
            if (acertos > maiorAcerto) maiorAcerto = acertos;
            if (acertos < menorAcerto) menorAcerto = acertos;
            
            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            char continuar = scanner.next().toUpperCase().charAt(0);
            if (continuar != 'S') break;
        }
        
        System.out.println("\nResultados finais:");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Média de acertos: %.1f\n", (double)totalAcertos/totalAlunos);
    }
}