package Exercicios_PSC_5;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int somaDiagonalPrincipal = 0;
        int tamanhoMatriz = 10;

        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < tamanhoMatriz; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        double mediaDiagonalPrincipal = (double) somaDiagonalPrincipal / tamanhoMatriz;

        System.out.println("A média dos elementos da diagonal principal é: " + mediaDiagonalPrincipal);
    }
}