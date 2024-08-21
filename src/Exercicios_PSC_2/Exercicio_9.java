package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {
        double laranja = 0.30;
        Scanner ler = new Scanner(System.in);
        String nomeProduto = "laranja";
        System.out.printf("Entre com o numero de %s(s) a serem compradas?", nomeProduto);
        int quantidadeProduto = ler.nextInt();

        if (quantidadeProduto >= 12) {
            laranja = 0.25;
        }

        double compraFinal = laranja * quantidadeProduto;
        System.out.printf(String.format("%d unidade(s) de %s a R$ %.2f a unidade = R$ %.2f ",quantidadeProduto, nomeProduto ,laranja, compraFinal));
    }
}
