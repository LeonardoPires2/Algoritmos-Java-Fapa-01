package Exercicios_PSC_5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y;

        System.out.println("Digite um numero");
        x = ler.nextInt();
        System.out.println("Digite outro numero");
        y = ler.nextInt();

        while (x == y) {
            System.out.println("Digite outro numero diferente do primeiro");
            y = ler.nextInt();
        }

        verificaMaiorNumero(x,y);
    }

    public static void verificaMaiorNumero(int x, int y){
        if (x > y) {
            System.out.printf("%d é maior que o %d", x, y);
        } else {
            System.out.printf("%d é maior que o %d", y, x);
        }
    }
}
