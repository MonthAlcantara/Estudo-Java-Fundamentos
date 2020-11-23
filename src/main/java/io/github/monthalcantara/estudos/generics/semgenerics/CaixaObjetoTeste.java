package io.github.monthalcantara.estudos.generics.semgenerics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {
        /**
         * O problema dessa abordagem é que eu preciso fazer um cast específico ao retornar
         * um object.
         * No caso abaixo acontece um erro ao executar por que estou tentando converter um Double em Integer.
         * Em tempo de compilação ele funciona mas ao tentar converter (em tempo de execução) dá problema
         * Nessa abordagem eu preciso ter certeza do tipo de valor que está chegando para fazer o cast correto
         */

        CaixaObjetoSemGenerics caixaA = new CaixaObjetoSemGenerics();
        caixaA.guardar(2.3);

        Integer coisa = (Integer) caixaA.abrir();
        System.out.println(coisa);
    }
}
