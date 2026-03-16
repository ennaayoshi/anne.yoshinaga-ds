import java.util.Scanner;
        
// @author Anne Lie

public class Exercício2 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 2 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma Quantidade de Horas: ");
        int horas = scanner.nextInt();

        int minutos = horas * 60; 

        System.out.println("A conversão das horas informadas é igual a " + minutos + " minutos.");
    }
}