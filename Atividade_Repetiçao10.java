/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_repetiçao10;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class Atividade_Repetiçao10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva um numero: ");
        int a = input.nextInt();
        if(a == 0){
            System.out.println("Valor invalido");
        
        } else{
            
        
        for(int inicio = 1; inicio<=a;a-- ){
            System.out.println(a);
        }
        }
    }
    
}
