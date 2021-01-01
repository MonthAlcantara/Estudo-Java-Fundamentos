package io.github.monthalcantara.estudos.streams;

public class TesteArrayPrimitivo {
    public static void main(String[] args) {

        //Array [] - Estrutura de baixo nível

        int[] num = new int[5]; // Inicia todos os indices com va lor 0

        for (int i = 0 ; i < num.length; i++){
            num[i] = i;
            System.out.println(num[i]);
        }
    }
}
