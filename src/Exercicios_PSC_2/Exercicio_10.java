package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
        double banana = 0.30, laranja = 0.40, maca = 0.50, kiwi = 0.40, produto = 0;
        int escolhaDoUsuario;
        Scanner ler = new Scanner(System.in);

        String opcoesCompra = """
                1.Banana 0.30R$ ou R$ 0.25 "preco duzia ou mais"
                2.Laranja 0.40R$ ou R$ 0.35 "preco duzia ou mais"
                3.Maca 0.50R$ ou R$ 0.40 "preco duzia ou mais"
                4.Kiwi 0.40R$ ou R$ 0.30 "preco duzia ou mais"
                """;

        System.out.println("Olá, somos o mercado virtual o que vai querer hoje senhor?");
        System.out.println(opcoesCompra);
        escolhaDoUsuario = ler.nextInt();

        while(escolhaDoUsuario >= 5 || escolhaDoUsuario <= 0){
            System.out.println("Digite uma opção válida");
            escolhaDoUsuario = ler.nextInt();
        }

        System.out.println("Qual a quantidade que o senhor(a) quer?");
        int quantidadeProduto = ler.nextInt();

        if(escolhaDoUsuario == 1 && quantidadeProduto >= 12){
            banana = 0.25;
        } else if (escolhaDoUsuario == 2 && quantidadeProduto >= 12){
            laranja = 0.35;
        } else if (escolhaDoUsuario == 3 && quantidadeProduto >= 12){
            maca = 0.45;
        } else if (escolhaDoUsuario == 4 && quantidadeProduto >= 12){
            kiwi = 0.30;
        }

        String nomeProduto = switch (escolhaDoUsuario){
            case 1 -> "banana";
            case 2 -> "laranja";
            case 3 -> "maca";
            case 4 -> "kiwi";
            default -> throw new IllegalStateException("Unexpected value: " + escolhaDoUsuario);
        };

        produto = switch (escolhaDoUsuario) {
            case 1 -> banana;
            case 2 -> laranja;
            case 3 -> maca;
            case 4 -> kiwi;
            default -> produto;
        };

        if(0 > quantidadeProduto) {
            double compraFinal = produto * quantidadeProduto;
            System.out.printf(String.format("%d unidade(s) de %s a R$ %.2f a unidade = R$ %.2f ",quantidadeProduto, nomeProduto ,produto, compraFinal));
        } else {
            System.out.println("nao comprou nenhuma");
        }

    }
}
