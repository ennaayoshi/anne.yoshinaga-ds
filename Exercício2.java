/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexsjava;
import java.util.Scanner;
        
// @author Anne Lie

public class Exercício2 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 2 - ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o 1º Número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o 2º Número: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("O número" + numero1 + "é  maior que" + numero2 + ".");
        }
        else if (1 == numero2) {
            System.out.println("Os números informados são equivalentes/iguais.");
        }
        else {
            System.out.println("O número" + numero2 + "é  maior que" + numero1 + ".");
        }
    }
}