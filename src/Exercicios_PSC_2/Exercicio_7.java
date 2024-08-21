package Exercicios_PSC_2;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
        int eleitores, nulos, brancos, validos;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre o numero de eleitores");
        eleitores = ler.nextInt();
        System.out.println("Entre o numero de votos brancos");
        nulos = ler.nextInt();
        System.out.println("Entre o numero de votos nulos");
        brancos = ler.nextInt();
        System.out.println("Entre o numero de votos validos");
        validos = ler.nextInt();

        validos = validos * 100 / eleitores;
        nulos = nulos * 100 / eleitores;
        brancos = brancos * 100 / eleitores;

        System.out.println(String.format("Resultado:\n %d votos em brancos\n %d votos em nulos\n %d votos em validos", brancos, nulos, validos));
    }
}
