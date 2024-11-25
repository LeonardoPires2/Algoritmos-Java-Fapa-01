package Exercicios_PSC_5;
import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int[][] matrizM = new int[6][6];
        int[] vetorV = new int[36];
        int A;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz M:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizM[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();

        int k = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                vetorV[k] = matrizM[i][j] * A;
                k++;
            }
        }

        System.out.println("Vetor V:");
        for (int i = 0; i < 36; i++) {
            System.out.print(vetorV[i] + " ");
        }
    }
}