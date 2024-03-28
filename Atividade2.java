/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade2 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância total percorrida pelo automóvel (em km): ");
        double distanciaTotal = scanner.nextDouble();
        
        System.out.print("Digite o total de combustível gasto pelo automóvel (em litros): ");
        double combustivelGasto = scanner.nextDouble();
        
        double consumoMedio = distanciaTotal / combustivelGasto;
        
        System.out.println("O consumo médio do automóvel é de: " + consumoMedio + " km/l");

    }
    
}
