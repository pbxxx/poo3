import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votos = new int[6]; // 0-3: candidatos, 4: nulos, 5: brancos
        String[] candidatos = {"José", "João", "Maria", "Ana"};
        
        System.out.println("Códigos de votação:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d - %s\n", i+1, candidatos[i]);
        }
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Encerrar votação");
        
        while (true) {
            System.out.print("\nCódigo do voto: ");
            int voto = scanner.nextInt();
            if (voto == 0) break;
            
            if (voto >= 1 && voto <= 6) {
                if (voto <= 4) {
                    votos[voto-1]++;
                } else if (voto == 5) {
                    votos[4]++;
                } else {
                    votos[5]++;
                }
            } else {
                System.out.println("Código inválido!");
            }
        }
        
        int totalVotos = 0;
        for (int v : votos) totalVotos += v;
        
        System.out.println("\nResultado da eleição:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s: %d votos (%.1f%%)\n", 
                            candidatos[i], votos[i], (double)votos[i]/totalVotos*100);
        }
        System.out.printf("Votos nulos: %d (%.1f%%)\n", 
                        votos[4], (double)votos[4]/totalVotos*100);
        System.out.printf("Votos em branco: %d (%.1f%%)\n", 
                        votos[5], (double)votos[5]/totalVotos*100);
        System.out.println("Total de votos: " + totalVotos);
    }
}