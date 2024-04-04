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

public class While4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int numAlunos = scanner.nextInt();

        int contador = 0;
        double somaNotas = 0;

        while (contador < numAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }

        double media = somaNotas / numAlunos;
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}
