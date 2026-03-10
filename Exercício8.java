/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício8 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 8 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor do Produto: ");
        float valorP = scanner.nextFloat();

        if (valorP > 100) {
            float desconto20 = (valorP  * 20) / 100;
            float total20 = valorP - desconto20;
            System.out.println("O total é de " + total20 + "R$.");
        }
        else {
            float desconto10 = (valorP  * 10) / 100;
            float total10 = valorP - desconto10;
            System.out.println("O total é de " + total10 + "R$.");
        }
    }
}