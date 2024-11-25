package Exercicios_PSC_5;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int linhas = 7;
        int colunas = 9;
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz gerada:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}