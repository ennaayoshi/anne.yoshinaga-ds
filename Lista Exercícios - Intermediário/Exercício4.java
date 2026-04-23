import java.util.Scanner;

// @author Anne Lie

public class Exercício4 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 4 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Informe o Valor: ");
        int valor = scanner.nextInt();

        System.out.println();
        System.out.println("100: " + v / 100);
        valor %= 100;

        System.out.println();
        System.out.println("50: " + v / 50);
        valor %= 50;

        System.out.println();
        System.out.println("20: " + v / 20);
        valor %= 20;

        System.out.println();
        System.out.println("10: " + v / 10);
        valor %= 10;

        System.out.println();
        System.out.println("5: " + v / 5);
        valor %= 5;

        System.out.println();
        System.out.println("2: " + v / 2);
        valor %= 2;

        System.out.println();
        System.out.println("1: " + v);
    }
}