package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
        int horas, minutos, segundos;

        Scanner ler = new Scanner(System.in);
        System.out.println("digite a horas atuais");
        horas = ler.nextInt();
        System.out.println("digite os minutos atuais");
        minutos = ler.nextInt();
        System.out.println("digite os segundos atuais");
        segundos = ler.nextInt();

        int totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;
        System.out.printf("total segundos do seu dia %d", totalSegundos);
    }
}
