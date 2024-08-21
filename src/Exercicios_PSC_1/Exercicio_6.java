package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura do lugar que vc está em fh : ");
        double temperatura = ler.nextDouble();
        double celsius = 5 * (temperatura - 32) / 9;
        System.out.printf("A temperatura de %.0f Celsius é equivalente a %.1f Fahrenheit", celsius, temperatura);
    }
}
