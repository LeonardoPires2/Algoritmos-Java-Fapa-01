package Exercicios_PSC_4;

public class Ex4 {
    public static void main(String[] args) {
        int x[] = new int[20];
        int pares = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = i;

            if(x[i] % 2 == 0){
                pares++;
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.printf("\n%d valores pares encontrados", pares);
    }
}
