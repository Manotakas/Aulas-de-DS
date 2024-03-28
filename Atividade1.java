/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite um numero: ");
        double numero2 = scanner.nextDouble();
        
        double soma = numero1 + numero2;
        System.out.println("Soma: "+soma);
        
        double subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao);
        
         double multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicacao);
        
        if (numero2 != 0) {
            // Calcular e mostrar a divisão
            double divisao = numero1 / numero2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão por zero não é definida");
        }
    }
    
}
