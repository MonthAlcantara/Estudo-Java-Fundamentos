package io.github.monthalcantara.estudos.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        System.out.println("\n>> Teste utilizando operador Duplo '&&' <<\n");
        System.out.println("false && true = " +
                (primeiraCondicao(false) && segundaCondicao(true)) +
                " -> sem teste da segunda condição.\n");

        System.out.println(">> Teste utilizando operador Simples '&' <<\n");

        System.out.println("false & true = " +
                (primeiraCondicao(false) & segundaCondicao(true)) +
                " -> com teste da segunda condição.\n");

        System.out.println(">> Teste utilizando operador Duplo '||' << \n");

        System.out.println("true || false = " +
                (primeiraCondicao(true) || segundaCondicao(false)) +
                " -> sem teste da segunda condição.\n");

        System.out.println(">> Teste utilizando operador Simples '|' <<\n");

        System.out.println("true | false = " +
                (primeiraCondicao(true) | segundaCondicao(false)) +
                " -> com teste da segunda condição.");

    }

    private static boolean primeiraCondicao(boolean retorno) {
        System.out.println("Entrou e executou o teste da primeira condição");
        return retorno;
    }

    private static boolean segundaCondicao(boolean retorno) {
        System.out.println("Entrou e executou o teste da segunda condição");
        return retorno;
    }

}
