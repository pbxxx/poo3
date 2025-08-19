import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número total de votantes: ");
        int totalVotantes = scanner.nextInt();
        int[] votos = new int[3];
        
        for (int i = 0; i < totalVotantes; i++) {
            System.out.print("Votante " + (i+1) + ", vote (1, 2 ou 3): ");
            int voto = scanner.nextInt();
            if (voto >= 1 && voto <= 3) {
                votos[voto-1]++;
            }
        }
        
        System.out.println("Resultado:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Candidato " + (i+1) + ": " + votos[i] + " votos");
        }
    }
}