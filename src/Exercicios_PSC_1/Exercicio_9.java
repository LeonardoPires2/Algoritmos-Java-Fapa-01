package Exercicios_PSC_1;

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {
        int quantidadeHomens, quantidadeMulheres, quantidadeCriancas, convidados;
        double kg, quantidadeDeCarneEmGramas;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de homens vão ir na festa:");
        quantidadeHomens = ler.nextInt();
        System.out.println("Digite a quantidade de mulheres vão ir na festa:");
        quantidadeMulheres = ler.nextInt();
        System.out.println("Digite a quantidade de criancas vão ir na festa:");
        quantidadeCriancas = ler.nextInt();

        quantidadeDeCarneEmGramas = (quantidadeHomens * 650) + (quantidadeMulheres * 420) + quantidadeCriancas * 290;
        kg = quantidadeDeCarneEmGramas / 1000;
        convidados = quantidadeHomens + quantidadeCriancas + quantidadeMulheres;

        System.out.printf("Teremos que comprar %.2f kg de carne para %d convidados", kg, convidados);
    }
}
