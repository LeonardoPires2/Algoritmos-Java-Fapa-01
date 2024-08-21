package Exercicios_PSC_3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, soma = 0;

        a = ler.nextInt();
        b = ler.nextInt();

        while(a>b){
            System.out.printf("digite um numero menor que %d", a);
            b = ler.nextInt();
        }

        for(int i = a; i<=b; i++){
            if(i % 5 == 0){
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("soma dos numeros divisiveis por 5 é " + soma);
    }
}
