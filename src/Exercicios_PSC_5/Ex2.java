package Exercicios_PSC_5;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int linhas = 6;
        int colunas = 8;
        int[][] matriz = new int[linhas][colunas];
        int[] vetorC = new int[linhas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(201) - 100;
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] < 0) {
                    vetorC[i]++;
                }
            }
        }
        System.out.println("Matriz M:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        System.out.println("Vetor C (quantidade de negativos por linha):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}