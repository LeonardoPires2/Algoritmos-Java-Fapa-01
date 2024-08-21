package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y, z;

        System.out.println("Entre com os 3 lados do triangulo");
        x = ler.nextInt();
        y = ler.nextInt();
        z = ler.nextInt();

        if(x < (y + z) && y < (x + z) && z < (x + y)){
            System.out.println("os lados formam um triangulo");
        } else {
            System.out.println("os lados n formam um triangulo");
        }
    }
}
