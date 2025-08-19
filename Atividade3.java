import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine(); 
        
        if (nome.length() <= 3) {
            System.out.println("Nome deve ter mais que 3 caracteres");
        }

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade < 0 || idade > 150) {
            System.out.println("Idade deve ser maior que 0 e menor que 150");
        }

        System.out.print("Digite seu salário: ");
        salario = scanner.nextDouble();

        if (salario < 0) {
            System.out.println("Salário não pode ser 0 ou negativo");
        }

        System.out.print("Digite seu sexo (M/F): ");
        sexo = scanner.next();

        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            System.out.println("Sexo deve ser M ou F");
        }

        System.out.print("Digite seu estado civil (S/C/V/D): ");
        estadoCivil = scanner.next();

        if (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C") &&
            !estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")) {
            System.out.println("Estado civil deve ser S, C, V ou D");
        } else {
            System.out.println("Dados válidos!");
        }
        scanner.close();
    }
}
