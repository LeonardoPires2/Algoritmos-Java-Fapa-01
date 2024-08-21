package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;

        System.out.println("Digite um numero");
        x = ler.nextInt();

        if(x >= 100 && x <= 200){
            System.out.println("%d esta no intervalo de tempo (100, 200)");
        } else {
            System.out.println("%d nao esta no intervalo de tempo (100, 200)");
        }
    }
}
