/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2803;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner1.nextInt();

        System.out.println("Números Pares:");
        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nNúmeros Ímpares:");
        i = 1;
        while (i <= num) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        scanner1.close();
    }
}
