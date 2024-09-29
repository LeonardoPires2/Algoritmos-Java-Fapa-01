package Exercicios_PSC_4;

public class Ex2 {

    public static void main(String[] args) {
        int a[] = new int[10];
        int b = 0;

        for (int i = 0; i < 10; i++) {
            b += 10;
            a[i] = b;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
