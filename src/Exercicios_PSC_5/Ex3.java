package Exercicios_PSC_5;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;
        int[][] matriz = new int[linhas][colunas];
        int[] somaColunas = new int[colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("Matriz:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        System.out.println("Soma de cada coluna:");
        for (int i = 0; i < colunas; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + somaColunas[i]);
        }
    }
}
