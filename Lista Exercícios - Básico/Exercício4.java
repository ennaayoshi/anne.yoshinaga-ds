import java.util.Scanner;
        
// @author Anne Lie

public class Exercício4 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 4 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Digite um Número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabuada do " + numero + ":");
        
        System.out.println();
        
        for (int i = 1; i <=  10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}