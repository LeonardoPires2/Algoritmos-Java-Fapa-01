package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        float notas, soma = 0;
        Scanner ler = new Scanner(System.in);

        for(int i =1; i <= 4; i++){
            System.out.printf("Digite o numero %d:", i);
            notas = ler.nextFloat();
            soma += notas;
        }

        float media = soma / 4;
        System.out.printf("o resultado da sua media é:%.2f ", media);
    }
}
