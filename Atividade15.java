public class Atividade15 {
    public static void main(String[] args) {
        double soma = 0.0;
        
        for (int i = 1; i <= 37; i++) {
            int numerador = (38 - i) * (39 - i);
            double termo = (double) numerador / i;
            soma += termo;
        }
        
        System.out.printf("Soma da série: %.2f\n", soma);
    }
}