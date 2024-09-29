package Exercicios_PSC_3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int x;
        int contadorPar = 0;
        int contadorImpar = 0;
        int somaPar = 0 , somaImpar = 0;

        Scanner ler = new Scanner(System.in);
        x = ler.nextInt();

        for(int i = 1; i <= x; i++){
            if(i % 2 == 0){
                contadorPar++;
                somaPar =+ i;
            } else {
                contadorImpar++;
                somaImpar =+ i;
            }
        }
            System.out.printf("total de %d pares\n", contadorPar);
            System.out.printf("total de soma dos pares %d\n", somaPar);
            System.out.printf("total de %d impar", contadorImpar);
            System.out.printf("total de soma dos ímpares %d\n", somaImpar);
    }
}
