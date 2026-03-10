/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício1 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 1 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número informado é par.");
        }
        else {
            System.out.println("O número informado é ímpar.");
        }
    }
}