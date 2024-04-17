package Atividade14;

public class Atividade14 {
    public static void main(String[] args) {
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;
        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015;
        int anos;

        for (anos = 0; populacaoA < populacaoB; anos++) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
        }

        System.out.println("Número de anos necessários para que a população de A ultrapasse ou iguale a população de B: " + anos);
    }
}