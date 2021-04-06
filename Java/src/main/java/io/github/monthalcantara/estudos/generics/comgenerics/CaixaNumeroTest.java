package io.github.monthalcantara.estudos.generics.comgenerics;

public class CaixaNumeroTest {
    public static void main(String[] args) {
        /*
         * Nem compila pq String não é filha de Number
         * CaixaNumero<String> caixaA = new CaixaNumero<>();
         * */

        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.5);
        System.out.println(caixaA.abrir());
    }
}
