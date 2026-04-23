import java.util.Scanner;

// @author Anne Lie

public class Exercício3 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 3 - ");
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;

        while (tentativas < 3) {
            System.out.println();
            System.out.print("Entre com o Usuário: ");
            String u = scanner.nextLine();
            System.out.println();
            System.out.print("Senha: ");
            String s = scanner.nextLine();

            if (u.equals("admin") && s.equals("1234")) {
                System.out.println();
                System.out.println("Login OK");
                return;
            }

            tentativas++;
            System.out.println();
            System.out.println("Erro!");
        }

        System.out.println();
        System.out.println("Bloqueado");
    }
}