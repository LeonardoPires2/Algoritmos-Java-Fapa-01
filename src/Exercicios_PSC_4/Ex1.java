package Exercicios_PSC_4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int x[] = new int[10];
        for(int i = 0; i < 10; i++){
            x[i] = 30;
        }

        imprime();

        for (int i=0; i< x.length; i++){
            System.out.print(x[i]);
        }
    }

    public static void imprime(){
        System.out.println("eu");
    }
}


