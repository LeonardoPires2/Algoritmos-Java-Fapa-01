package Exercicios_PSC_4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
       int array[] = new int[6], soma = 0, produto = 1;

       Scanner ler = new Scanner(System.in);
       System.out.println("Digite 6 valores");

       for (int i = 0; i < 6; i++ ){
           array[i] = ler.nextInt();
       }

        System.out.println("""
                1 - Soma dos elementos
                2- Produto dos elementos
                3- Média dos elementos
                4 - Mostre o vetor
                """);

        int escolha = ler.nextInt();

        switch (escolha){
            case 1:
                for (int i = 0; i < array.length; i++){
                    soma += array[i];
                }
                System.out.println(soma);
                break;
            case 2:
                for (int i = 0; i < array.length; i++){
                    produto *= array[i];
                }
                System.out.println(produto);
                break;
            case 3:
                for (int i = 0; i < array.length; i++){
                    soma += array[i];
                }
                System.out.println((float) soma/ array.length);
                break;
            case 4:
                System.out.println(Arrays.toString(array));
                break;
        }
    }
}
