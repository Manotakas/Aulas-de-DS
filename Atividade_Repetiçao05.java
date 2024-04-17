package com.example;
import java.util.Scanner;
public class Atividade_Repetiçao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char novoCalculo = 'S';
        
        while (novoCalculo == 'S' || novoCalculo == 's') {
            double nota1 = 0, nota2 = 0;
            
            for (int i = 1; i <= 2; i++) {
                System.out.print("Digite a nota da " + i + "ª avaliação: ");
                double nota = input.nextDouble();
                
                while (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
                    System.out.print("Digite a nota da " + i + "ª avaliação novamente: ");
                    nota = input.nextDouble();
                }
                
                if (i == 1) {
                    nota1 = nota;
                } else {
                    nota2 = nota;
                }
            }
            
            double media = (nota1 + nota2) / 2;
            
            System.out.println("A média do aluno é: " + media);
            
            System.out.print("NOVO CÁLCULO (S/N)? ");
            novoCalculo = input.next().charAt(0);
        }
        
        System.out.println("Programa encerrado.");
    }
}