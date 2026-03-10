/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício5 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 5 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Salário: ");
        float salario = scanner.nextFloat();

        if (salario < 2000) {
            float porcentagem10 = (salario * 10)/100;
            float salario10 = porcentagem10 + salario;
            System.out.println("O salário atual é de " + salario10 + ".");
        }
        else if (salario >= 2000 && salario <= 4000) {
            float porcentagem7 = (salario * 7)/100;
            float salario7 = porcentagem7 + salario;
            System.out.println("O salário atual é de " + salario7 + ".");
        }
        else {
            float porcentagem5 = (salario * 5)/100;
            float salario5 = porcentagem5 + salario;
            System.out.println("O salário atual é de " + salario5 + ".");
        }
    }
}