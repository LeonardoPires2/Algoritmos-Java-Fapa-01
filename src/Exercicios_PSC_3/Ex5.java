package Exercicios_PSC_3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int num1;
        Scanner leia = new Scanner(System.in);
        num1 = leia.nextInt();

        while(num1 > 0) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(num1 + " * " + i + "=" + num1 * i);
            }
            num1 = leia.nextInt();
        }
    }
}
