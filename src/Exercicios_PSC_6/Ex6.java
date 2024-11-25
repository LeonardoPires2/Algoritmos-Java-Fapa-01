package Exercicios_PSC_6;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];

        vetor(a,b,c);
        System.out.println(Arrays.toString(c));
    }

    public static void vetor(int a[], int b[], int c[]) {
        for (int i = 0; i < 10; i++) {
            a[i] = i;
            b[i] = i;
            c[i] = a[i] * b[i];
        }
    }
}
