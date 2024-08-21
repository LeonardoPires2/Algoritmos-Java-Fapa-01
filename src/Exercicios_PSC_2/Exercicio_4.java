package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y;

        System.out.println("Digite um numero");
        x = ler.nextInt();
        System.out.println("Digite outro numero");
        y = ler.nextInt();

        while(x == y){
            System.out.println("Digite outro numero diferente do primeiro");
            y = ler.nextInt();
        }

        if(x < y){
            System.out.printf("%d é o < dos numeros digitados", x);
        } else {
            System.out.printf("%d é o < dos numeros digitados", y);
        }
    }
}

