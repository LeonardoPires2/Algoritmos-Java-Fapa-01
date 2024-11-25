package Exercicios_PSC_5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        int[][] matrizS = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz S (soma de A e B):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizS[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

