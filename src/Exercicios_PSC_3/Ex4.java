package Exercicios_PSC_3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor1, valor2;
        System.out.print("Digite dois números: ");
        valor1 = ler.nextInt();
        valor2 = ler.nextInt();

        while(valor1 != valor2) {
            if (valor1 > valor2) {
                System.out.println("decrescente");
            } else {
                System.out.println("crescente");
            }
            System.out.print("Digite dois números: ");
            valor1 = ler.nextInt();
            valor2 = ler.nextInt();
        }
    }
}
