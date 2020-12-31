package io.github.monthalcantara.estudos.recursividade;

public class RecursividadeTest {
    public static void main(String[] args) {
        int [][]matriz = new int[3][3];
        matriz[0][0]= 3;
        matriz[1][0]= 6;
        matriz[2][0]= 4;
        matriz[0][1]= 7;
        matriz[1][1]= 2;
        matriz[2][1]= 5;
        matriz[0][2]= 4;
        matriz[1][2]= 8;
        matriz[2][2]= 3;

        for(int i=1; i<3; i++){
            for(int j=1; j<3; j++){
                if((matriz[i][j]%2) == 0) {
                    System.out.print(matriz[i][j]);
                }
            }
        }
    }
}
