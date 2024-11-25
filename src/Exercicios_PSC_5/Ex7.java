package Exercicios_PSC_5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int[][] matrizM = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz M:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizM[i][j] = scanner.nextInt();
            }
        }

        int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0, somaTotal = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaTotal += matrizM[i][j];
                if (i == 3) {
                    somaLinha4 += matrizM[i][j];
                }
                if (j == 1) {
                    somaColuna2 += matrizM[i][j];
                }
                if (i == j) {
                    somaDiagonalPrincipal += matrizM[i][j];
                }
            }
        }

        System.out.println("Matriz M:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizM[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Soma da linha 4: " + somaLinha4);
        System.out.println("Soma da coluna 2: " + somaColuna2);
        System.out.println("Soma da diagonal principal:" + somaDiagonalPrincipal);
        System.out.println("Soma de todos os elementos:" + somaTotal);
    }
}