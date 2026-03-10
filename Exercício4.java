/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
        
// @author Anne Lie

public class Exercício4 {
    public static void main(String[] args) {
        System.out.println(" - Exercício 4 - ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a 1ª Nota: ");
        float nota1 = scanner.nextFloat();
        
        System.out.println("Digite o 2ª Nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Digite o 3ª Nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno está aprovado.");
        }
        else if (media >= 5 && media <= 7 ) {
            System.out.println("O aluno está em situção de recuperação.");
        }
        else {
            System.out.println("O aluno está reprovado.");
        }
    }
}