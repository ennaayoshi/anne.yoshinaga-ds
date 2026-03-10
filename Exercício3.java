/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexsjava;
import java.util.Scanner;
        
// @author Anne Lie

public class Exercício3 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 3 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        float numero = scanner.nextFloat();

        if (numero > 0) {
            System.out.println("O número informado é positivo.");
        }
        else if (numero == 0) {
            System.out.println("O número informado é igual a 0.");
        }
        else {
            System.out.println("O número informado é negativo.");
        }
    }
}