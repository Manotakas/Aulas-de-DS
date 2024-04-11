/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprima1ate10;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */ 
public class Imprima1ate10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva um numero: ");
        int i = input.nextInt();
        
        for(int inicio = 1; inicio<=i;inicio++ )
        {
            System.out.println("Numero "+inicio);
        }
            
    }
    
}
