/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadewhile7;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class AtividadeWhile7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanho = scanner.nextInt();
        
        if (tamanho < 1 || tamanho > 20) {
            System.out.println("Tamanho inválido. O tamanho do lado deve estar entre 1 e 20.");
        } else {
            
            for (int i = 0; i < tamanho; i++) {
                
                for (int j = 0; j < tamanho; j++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }
        }
        
    }
    
}
