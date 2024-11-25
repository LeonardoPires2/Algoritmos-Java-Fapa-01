package Exercicios_PSC_5;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 10;
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < linhas; i++) {
            int somaLinha = 0;
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
                if (i % 2 == 0) {
                    somaLinha += matriz[i][j];
                }
            }
            if (i % 2 == 0) {
                System.out.println(" - Soma da linha: " + somaLinha);
            } else {
                System.out.println();
            }
        }
    }
}
