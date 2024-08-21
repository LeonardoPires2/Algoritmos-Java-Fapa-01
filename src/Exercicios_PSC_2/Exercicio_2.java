package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;

        System.out.println("Digite um numero");
        x = ler.nextInt();

        if(x % 2 == 0){
            System.out.println("numero lido é par");
        } else {
            System.out.println("numero lido é ímpar");
        }
    }
}
