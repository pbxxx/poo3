import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.print("Digite o nome de usuário: ");
        usuario = scanner.nextLine();   
        System.out.print("Digite a senha: ");
        senha = scanner.nextLine();

        if (usuario.equals(senha)) {
            System.out.println("Usuário e senha não podem ser iguais.");
        }
        scanner.close();
    }
}

