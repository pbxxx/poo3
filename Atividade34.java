import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intervalos = new int[4]; // [0-25], [26-50], [51-75], [76-100]
        
        System.out.println("Digite números positivos (negativo para encerrar):");
        while (true) {
            double num = scanner.nextDouble();
            if (num < 0) break;
            
            if (num <= 25) intervalos[0]++;
            else if (num <= 50) intervalos[1]++;
            else if (num <= 75) intervalos[2]++;
            else if (num <= 100) intervalos[3]++;
        }
        
        System.out.println("\nQuantidade de números em cada intervalo:");
        System.out.println("[0-25]: " + intervalos[0]);
        System.out.println("[26-50]: " + intervalos[1]);
        System.out.println("[51-75]: " + intervalos[2]);
        System.out.println("[76-100]: " + intervalos[3]);
    }
}