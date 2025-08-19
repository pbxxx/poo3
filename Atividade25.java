public class Atividade25 {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d - R$ %.2f\n", i, 1.99 * i);
        }
    }
}