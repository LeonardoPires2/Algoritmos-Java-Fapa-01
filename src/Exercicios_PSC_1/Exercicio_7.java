package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("informe as polegadas");
        double polegadas = ler.nextDouble();
        double ml = polegadas * 25.4;

        System.out.printf("%.2f", ml);
    }
}
