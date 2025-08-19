import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Montar a tabuada de: ");
        int numero = scanner.nextInt();
        System.out.print("Começar por: ");
        int inicio = scanner.nextInt();
        System.out.print("Terminar em: ");
        int fim = scanner.nextInt();
        
        if (fim < inicio) {
            System.out.println("O valor final não pode ser menor que o inicial!");
            return;
        }
        
        System.out.printf("Tabuada de %d de %d a %d:\n", numero, inicio, fim);
        for (int i = inicio; i <= fim; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
}