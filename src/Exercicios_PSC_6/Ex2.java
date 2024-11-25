package Exercicios_PSC_6;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
            float notas, soma = 0;
            Scanner ler = new Scanner(System.in);

            for(int i =1; i <= 4; i++){
                System.out.printf("Digite o numero %d:", i);
                notas = ler.nextFloat();
                soma += notas;
            }

            System.out.printf("o resultado da sua media é:%.2f ", media(soma));

    }

    public static float media(float media){
        return media / 4;
    }

}
