package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        int numeros, soma = 0;
        Scanner ler = new Scanner(System.in);

        for(int i =1; i <= 3; i++){
            System.out.printf("Digite o numero %d:", i);
            numeros = ler.nextInt();
            soma += numeros;
        }
        System.out.printf("o resultado da sua soma é:%d ", soma);
    }
}
