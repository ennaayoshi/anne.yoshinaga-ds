import java.util.Scanner;

// @author Anne Lie

public class Exercício7 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 7 - ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Digite um Número: ");
        int numero = scanner.nextInt();
          
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {  
                System.out.println();
                System.out.println("Lista de números pares até o informado: ");
                System.out.println(i);
            }
        }
    }
}