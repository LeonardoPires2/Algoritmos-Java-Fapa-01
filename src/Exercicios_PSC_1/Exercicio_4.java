package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        int x = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        x = ler.nextInt();
        int quadrado  = x * 2;
        double resto = x % 3;
        int metade = x / 2;
        int produto = quadrado / metade;

        System.out.printf("Valor de X: %d \nQuadrado de x: %d\nResto divisão:%.2f\nMetade de X: %d\nProduto de x sobre a metade: %d ",
                x, quadrado, resto, metade, produto );

    }
}
