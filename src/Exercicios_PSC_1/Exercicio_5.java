package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        float raio, pi= 3.141592F, areaCirculo;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio do circulo que você quer calcular");
        raio = ler.nextFloat();

        areaCirculo = pi * (raio * raio);

        System.out.printf("Area do circulo calculada %.2f", areaCirculo);

    }
}
