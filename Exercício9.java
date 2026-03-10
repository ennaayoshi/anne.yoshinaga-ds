/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício9 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 9 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º Número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o 2º Número: ");
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("O 1º número é múltiplo do 2º número.");
        }
        else {
            System.out.println("O 1º número não é múltiplo do 2º número.");
        }
    }
}