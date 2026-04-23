import java.util.Scanner;
        
// @author Anne Lie

public class Exercício5 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 5 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Digite um Número (1 - 7): ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
    case 1:
        System.out.println();
        System.out.println("Corresponde ao Domingo");
        break;
    case 2:
        System.out.println();
        System.out.println("Corresponde à Segunda-feira");
        break;
    case 3:
        System.out.println();
        System.out.println("Corresponde à Terça-feira");
        break;
    case 4:
        System.out.println();
        System.out.println("Corresponde à Quarta-feira");
        break;
    case 5:
        System.out.println();
        System.out.println("Corresponde à Quinta-feira");
        break;
    case 6:
        System.out.println();
        System.out.println("Corresponde à Sexta-feira");
        break;
    case 7:
        System.out.println();
        System.out.println("Corresponde ao Sábado");
        break;

    default:
        System.out.println();
        System.out.println("Dia Inexistente.");

        }
    }
}