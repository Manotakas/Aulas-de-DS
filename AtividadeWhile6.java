/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadewhile6;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class AtividadeWhile6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int contador = 1;
        int maior1 = Integer.MIN_VALUE; 
        int maior2 = Integer.MIN_VALUE;
        
         while (contador <= 10) {
            System.out.print("Digite o número " + contador + ": ");
            int numero = scanner.nextInt();
            
             if (numero > maior1) {
                maior2 = maior1; // Salva o valor anterior do maior número como segundo maior
                maior1 = numero; // Atualiza o primeiro maior número
            } else if (numero > maior2) {
                maior2 = numero; // Atualiza o segundo maior número
            }
            
            contador++;
        }
        
        System.out.println("Os dois maiores números digitados são: " + maior1 + " e " + maior2);
        
        
        
        
    }
    
}
