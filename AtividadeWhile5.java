/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadewhile5;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class AtividadeWhile5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int maior = Integer.MIN_VALUE;
         while (contador <= 10) {
            System.out.print("Digite o número " + contador + ": ");
            int numero = scanner.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            contador++;
        }
        
        System.out.println("O maior número digitado é: " + maior);
        
        scanner.close();
    }
    
}
