package Atividade16;

public class Atividade16 {
    public static void main(String[] args) {
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");
        
        System.out.print(primeiroTermo + " " + segundoTermo + " ");
        
        int proximoTermo;
        for (proximoTermo = primeiroTermo + segundoTermo; proximoTermo <= 500; proximoTermo = primeiroTermo + segundoTermo) {
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}