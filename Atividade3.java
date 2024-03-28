/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o total de vendas efetuadas pelo vendedor (em dinheiro): ");
        double totalVendas = scanner.nextDouble();
        
        double comissao = 0.15 * totalVendas;
        
        double salarioFinal = salarioFixo + comissao;
        
         System.out.println("\nInformações do vendedor:");
        System.out.println("Nome: " + nomeVendedor);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário final: R$ " + salarioFinal);

        scanner.close();
    }
    
}
