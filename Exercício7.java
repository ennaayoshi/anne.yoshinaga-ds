/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício7 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 7 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Temperatura (°C): ");
        float temperaturaC = scanner.nextFloat();

        float temperaturaF = (temperaturaC * 9/5) + 32;

        System.out.println("A temperatura em celsius informada é de " + temperaturaF + " em graus fahrenheit.");
    }
}