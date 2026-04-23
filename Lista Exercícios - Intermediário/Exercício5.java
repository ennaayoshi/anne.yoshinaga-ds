import java.util.Scanner;

// @author Anne Lie

public class Exercício5 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 5 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Digite uma Frase Qualquer: ");
        String frase = entrada.nextLine();

        String[] palavras = frase.split(" ");

        System.out.println();
        System.out.println("Quantidade de Palavras: " + palavras.length);
    }
}