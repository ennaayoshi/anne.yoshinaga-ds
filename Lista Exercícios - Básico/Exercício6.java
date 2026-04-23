import java.util.Scanner;
        
// @author Anne Lie

public class Exercício1 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 6 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        int escolhas;

        do {
            System.out.println("--- MENU DE OPÇÕES ---");
            System.out.println("1. Opção A");
            System.out.println("2. Opção B");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu A.");
                    break;
                case 2:
                    System.out.println("Você escolheu B.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } 
        while (opcao != 0);
    }
}