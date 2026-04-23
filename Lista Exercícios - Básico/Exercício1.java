import java.util.Scanner;
        
// @author Anne Lie

public class Exercício1 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 1 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        
        System.out.println("Digite um Número: ");
        int numero = scanner.nextInt();

        int contador = 1;

        while (contador <= numero) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}