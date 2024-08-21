package Exercicios_PSC_3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        int soma= 0, numeroPerfeito;

        Scanner ler = new Scanner(System.in);
        numeroPerfeito = ler.nextInt();

        for(int i = 1; i< numeroPerfeito; i++){
            if(numeroPerfeito % i == 0){
                soma += i;
            }
        }

        if(soma == numeroPerfeito){
            System.out.println("numero perfeito");
        } else{
            System.out.println("nao é numero perfeito");
        }
    }
}
