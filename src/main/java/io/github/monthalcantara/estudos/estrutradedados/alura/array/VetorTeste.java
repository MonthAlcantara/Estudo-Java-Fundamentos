package io.github.monthalcantara.estudos.estrutradedados.alura.array;

import io.github.monthalcantara.estudos.estrutradedados.alura.Aluno;

public class VetorTeste {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("José");
        Aluno a2 = new Aluno("João");
        Aluno a3 = new Aluno("Maria");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());

        lista.adiciona(a1);

        System.out.println(lista.tamanho());

        System.out.println(lista);

        lista.adiciona(a2);

        System.out.println(lista.tamanho());

        System.out.println(lista);

        lista.adiciona(1, a3);

        System.out.println(lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(a1));

        lista.remove(1);

        System.out.println(lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.pega(1));

    }
}
