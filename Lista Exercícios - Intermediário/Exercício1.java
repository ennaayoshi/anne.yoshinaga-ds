import java.util.Scanner;

// @author Anne Lie

public class Exercício1 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 1 - ");
        Scanner scanner = new Scanner(System.in);

        int soma = 0, maior = 0, menor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println("Digite um Número: ");
            int numero = scanner.nextInt();

            soma += numero;

            if (i == 1) {
                maior = menor = numero;
            }
            else {
                if (numero > maior) maior = numero;
                if (numero < menor) menor = numero;
            }
        }

        System.out.println("Soma igual a: " + soma);
        System.out.println();
        System.out.println("Média igual a: " + (soma / 5.0));
        System.out.println();
        System.out.println("Maior: " + maior);
        System.out.println();
        System.out.println("Menor: " + menor);
    }
}