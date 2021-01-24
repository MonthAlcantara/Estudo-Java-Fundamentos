package io.github.monthalcantara.estudos.designpatterns.visitor;

public class Programa {
    public static void main(String[] args) {


        Expressao conta = new Soma(new Numero(10), new Numero(20));
//        10 + 20
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
//        10 - 5
        Expressao direita = new Soma(new Numero(2), new Numero(10));
//       2 + 10
        Expressao soma = new Soma(esquerda, direita);
//        (10 - 5) + (2 + 10)

        /*
         *  Cada expressão sabe se avaliar, ou seja sabe realizar a execução da expressão.
         * um numero é uma expressão, uma soma é uma expressão, uma subtração é uma expressão.
         **/

        int resultado = soma.avalia();
        System.out.println(resultado);
    }
}
