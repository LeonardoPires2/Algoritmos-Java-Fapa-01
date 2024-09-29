package Exercicios_PSC_4;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int x[]= new int[10];
        int y[]= new int[10];

        for (int i=0; i < 10; i++){
            x[i] = i;
        }

        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
                y[i] = x[i];
                y[i] *= 2;
            }else{
                y[i] = x[i];
                y[i] *= 3;
            }
        }
        System.out.println(Arrays.toString(y));
    }
}
