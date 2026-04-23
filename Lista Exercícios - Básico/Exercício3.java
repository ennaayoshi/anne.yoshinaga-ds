import java.util.Scanner;
        
// @author Anne Lie

public class Exercício3 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 3 - ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        int soma = 0;

        while (true) {

            System.out.println("Digite Números para Somar (Digite 0 para Encerrar):");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            soma += numero; 

            System.out.println();
            System.out.println("A soma total é: " + soma);
        }
            System.out.println();
            System.out.println("Programa finalizado. Soma final igual a: " + soma);
    }
}