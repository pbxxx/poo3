import java.util.Scanner;
import java.util.ArrayList;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        ArrayList<Integer> divisores = new ArrayList<>();
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                divisores.add(i);
            }
        }
        
        if (divisores.isEmpty()) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo. É divisível por: " + divisores);
        }
    }
}