import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de turmas: ");
        int turmas = scanner.nextInt();
        int totalAlunos = 0;
        
        for (int i = 0; i < turmas; i++) {
            System.out.print("Alunos na turma " + (i+1) + ": ");
            int alunos = scanner.nextInt();
            while (alunos > 40) {
                System.out.println("Turma não pode ter mais de 40 alunos!");
                System.out.print("Alunos na turma " + (i+1) + ": ");
                alunos = scanner.nextInt();
            }
            totalAlunos += alunos;
        }
        
        double media = (double) totalAlunos / turmas;
        System.out.printf("Média de alunos por turma: %.1f\n", media);
    }
}