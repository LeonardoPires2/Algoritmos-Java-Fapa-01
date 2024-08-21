package Exercicios_PSC_3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int num1;

        Scanner ler = new Scanner(System.in);
        num1 = ler.nextInt();

        while(num1 != 0) {
            for (int i = 1; i <= num1; i++) {
                int multiplicacao = num1 * i;
                System.out.println(multiplicacao);
            }
                num1 = ler.nextInt();
        }
    }
}
