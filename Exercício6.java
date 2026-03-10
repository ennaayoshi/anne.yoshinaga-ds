/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício6 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 6 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("O indivíduo deve votar.");
        }
        else if (idade >= 16 && idade < 18) {
            System.out.println("O indivíduo já pode votar.");
        }
        else {
            System.out.println("O indivíduo ainda não pode votar.");
        }
    }
}