package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y, z;
        boolean triangulo;

        System.out.println("Entre com os 3 lados do triangulo");
        x = ler.nextInt();
        y = ler.nextInt();
        z = ler.nextInt();

        if (x < (y + z) && y < (x + z) && z < (x + y)) {
            System.out.println("os lados formam um triangulo");
            triangulo = true;
        } else {
            System.out.println("nao forma um triangulo");
            triangulo = false;
        }

        if (x == y || x == z || y == z && triangulo) {
            if (x == y && y == z) {
                System.out.println("Triângulo equilátero");
            } else {
                System.out.println("Triângulo isósceles");
            }
        } else if ((x != y) && y != z && (x != y) && triangulo) {
            System.out.println("Triângulo escaleno");
        }

    }
}