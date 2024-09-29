package Exercicios_PSC_5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero?");
        num1 = ler.nextInt();
        System.out.println("Digite um numero?");
        num2 = ler.nextInt();

        System.out.println("soma: " + soma(num1, num2));
    }

    public static int soma(int x, int y) {
        return x + y;
    }
}
