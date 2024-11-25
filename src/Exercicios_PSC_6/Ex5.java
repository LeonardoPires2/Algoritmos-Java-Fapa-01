package Exercicios_PSC_6;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int b[] = new int[10];
        vetor(b);
        System.out.println(Arrays.toString(b));
    }

    public static void vetor(int b[]){
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                b[i] = 20;
            } else {
                b[i] = 10;
            }
        }
    }
}
