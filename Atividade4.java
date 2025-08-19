import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float paisA = 80000;
        float paisB = 200000;
        float taxaA, taxaB;
        int anos = 0;

        System.out.println("Digite a taxa de crescimento do país A (1 para 1%): ");
        taxaA = scanner.nextFloat() / 100;
        System.out.println("Digite a taxa de crescimento do país B: ");
        taxaB = scanner.nextFloat() / 100; 

        while (paisA < paisB) {
            paisA += paisA * taxaA;
            paisB += paisB * taxaB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a do país B.");
        scanner.close();
    }   
}
