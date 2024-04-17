/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade11;


import java.util.Scanner;

public class Atividade11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a;
        System.out.println("Escreva um numero maior que 0: ");
        a = input.nextInt();
        
        while (a <= 0) {
            System.out.println("Valor invalido. O numero deve ser maior que 0.");
            System.out.println("Escreva um numero maior que 0: ");
            a = input.nextInt();
        }

        for(int inicio = a; inicio >= 1; inicio--) {
            System.out.println(inicio);
        }
    }
}
