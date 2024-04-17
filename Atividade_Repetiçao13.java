package Atividade13;

import java.util.Scanner;
public class Atividade13 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("me diga um numero(entre 1e10):");
        int num=input.nextInt();
        if(num<=10){
            for(int i=1;i<=10;i++){
                int cont=num*i;
                System.out.println("X"+i+" = "+cont);
                
            };
        }else{
            System.out.println("número não permitido");
        };
    }
    
}