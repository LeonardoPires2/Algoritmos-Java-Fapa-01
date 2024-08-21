package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_1 {
    ///(Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
    //calcule o produto entre eles e mostre o resultado.
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero?");
        num1 = ler.nextInt();
        System.out.println("Digite um numero?");
        num2 = ler.nextInt();

        int soma = num1 + num2;
        System.out.println(String.format("o resultado da sua soma é:%d ", soma));

    }
}
