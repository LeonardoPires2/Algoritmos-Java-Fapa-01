package Exercicios_PSC_6;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        int x[]= new int[10];
        int y[]= new int[10];

        for (int i=0; i < 10; i++){
            x[i] = i;
        }

        vetor(y,x);
        System.out.println(Arrays.toString(y));
    }
    public static void vetor(int y[], int x[]){
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
                y[i] = x[i];
                y[i] *= 2;
            }else{
                y[i] = x[i];
                y[i] *= 3;
            }
        }
    }

}
