package com.example;
import java.util.Scanner;
public class Atividade_Repetiçao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double num1 = 0;
        double num2 = 0;
        
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("Digite o primeiro valor: ");
                num1 = input.nextDouble();
            } else {
                System.out.print("Digite o segundo valor: ");
                num2 = input.nextDouble();
                
                while (num2 == 0) {
                    System.out.println("O segundo valor não pode ser zero.");
                    System.out.print("Digite um novo valor para o segundo número: ");
                    num2 = input.nextDouble();
                }
            }
        }
        
        double resultado = num1 / num2;
        System.out.println("O resultado da divisão é: " + resultado);
    }
}