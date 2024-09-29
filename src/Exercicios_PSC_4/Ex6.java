package Exercicios_PSC_4;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < 10; i++){
            int random = gerador.nextInt(21) - 10;

            if(random >= 0){
                vetor[i] = random;
            }
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição - " + i + " - " + vetor[i]);
        }

    }
}
