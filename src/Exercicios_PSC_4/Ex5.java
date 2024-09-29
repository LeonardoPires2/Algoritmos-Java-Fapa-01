package Exercicios_PSC_4;

public class Ex5 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];

        for(int i = 0; i < 10; i++){
            a[i] = i;
            b[i] = i;
            c[i] = a[i] * b[i];
        }

        for(int i = 0; i < a.length; i++){
            System.out.println(c[i]);
        }
    }
}
