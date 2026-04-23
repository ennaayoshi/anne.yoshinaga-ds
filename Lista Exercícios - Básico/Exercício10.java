import java.util.Scanner;

// @author Anne Lie

public class Exercício10 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 10 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite uma Frase: ");
        String frase = scanner.nextLine();

        System.out.println();
        System.out.print("Quantas Vezes Repetir a Mesma? ");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println();
            System.out.println(frase);
        }
    }
}