package io.github.monthalcantara.estudos.string;

public class TesteString {
    public static void main(String[] args) {

        /*
         * Java abstraiu o new String() para facilcitar nossa vida mas
         * no fundo, o que está ocorrendo é String nome = new String("Alura");
         * */
        String nome = "Alura";
        /*
         * aS ASPAS dizem que "teste" é uma String. Sendo assim o "teste" é uma instancia de String
         * e eu consigo chamar os métodos da da classe String por ele "teste".isEmpty();
         *
         * */

        /*
         * Não funciona. Strings são imutáveis. nome nasceu "Alura" e vai morrer "Alura"
         * O que eu posso fazer é criar uma outra String recebendo o resultado do replace
         * */
        nome.replace("A", "a");
        System.out.println("Nome : " + nome);

        String nomeAlterado = nome.replace("A", "a");
        System.out.println("Nome Alterado : " + nomeAlterado);


    }
}
