package Exercicios_PSC_4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int array[] = new int[20];

        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < 20; i++){
            array[i] = ler.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
