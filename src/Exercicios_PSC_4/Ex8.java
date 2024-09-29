package Exercicios_PSC_4;

import java.util.Arrays;

public class Ex8 {

    public static void main(String[] args) {
        int x[] = new int[10];

        for(int i = 0; i < 10; i++){
            x[i] = i;
        }

        for (int i = 0; i < 5; i++){
            int aux = x[i];
            x[i] = x[i + 5];
            x[i + 5] = aux;
        }

        System.out.println(Arrays.toString(x));
    }
}
