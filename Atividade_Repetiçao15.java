package Atividade15;

public class Atividade15 {
    public static void main(String[] args) {
        int n = 10; 
        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o " + n + "º termo:");
        System.out.print(primeiroTermo + " " + segundoTermo + " ");
        
        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}