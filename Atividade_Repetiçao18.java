package Atividade18;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int N = scanner.nextInt();

        int[] numeros = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int menorValor = numeros[0];
        int maiorValor = numeros[0];
        int soma = numeros[0];
        
        for (int i = 1; i < N; i++) {
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
            soma += numeros[i];
        }
        
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);
    }
}