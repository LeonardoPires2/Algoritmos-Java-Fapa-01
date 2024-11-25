package Exercicios_PSC_5;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
        double mediaDiagonalSecundaria;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        mediaDiagonalSecundaria = (double) somaDiagonalSecundaria / 3;

        for (int i = 0; i < 3; i++) {
            matriz[i][i] *= mediaDiagonalSecundaria;
        }

        System.out.println("Matriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}