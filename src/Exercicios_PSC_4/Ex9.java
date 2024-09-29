package Exercicios_PSC_4;

public class Ex9 {

    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        int x = 10;
        int y = 0;

        for(int i=0; i < 10; i++ ){
            x++;
            y++;
            a[i] = y;
            b[i] = x;
        }

        for(int i=0; i < 10; i++){
            c[i] = a[i];
            c[i + 10] = b[i];
        }

        for (int i=0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}
