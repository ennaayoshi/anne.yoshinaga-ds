import java.util.Scanner;

// @author Anne Lie

public class Exercício8 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 8 - ");
        Scanner scanner = new Scanner(System.in);
        
           int senha = 1234;
           int tentativa;
        
        for (int i = 1 ; i < 3 ; i++)
        {
            System.out.print("Digite sua Senha: ");
            tentativa = scanner.nextInt();
            
            if (tentativa != senha)
            {   
                System.out.println();
                System.out.println("Senha Incorreta, tente novamente.");
            }
            else {
                System.out.println();
                System.out.print("Senha Correta! Acesso liberado.");
                System.exit(0);
            }
        }
    }
}