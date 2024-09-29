package Exercicios_PSC_4;

public class Ex3 {

    public static void main(String[] args) {
        int b[] = new int[10];

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                b[i] = 20;
            } else {
                b[i] = 10;
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}


