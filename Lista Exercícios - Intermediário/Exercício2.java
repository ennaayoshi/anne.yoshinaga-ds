import java.util.Scanner;

// @author Anne Lie

public class Exercício2 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 2 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Informe seu CPF: ");
        String cpf = scanner.nextLine();

        if (cpf.length() == 14 &&
            cpf.charAt(3) == '.' &&
            cpf.charAt(7) == '.' &&
            cpf.charAt(11) == '-') {

            System.out.println("Formato Válido");
        } else {
            System.out.println("Formato Inválido");
        }
    }
}