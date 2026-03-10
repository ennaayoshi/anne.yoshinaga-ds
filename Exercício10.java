/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício10 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 10 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe seu Gênero (F ou M): ");
        String genero = scanner.nextLine();

        if (genero.equalsIgnoreCase("M")) {
            double pesoIdealH = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal é igual a " + pesoIdealH + " kg.");
        }
        else {
            double pesoIdealF = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é igual a " + pesoIdealF + " kg.");
        }
    }
}