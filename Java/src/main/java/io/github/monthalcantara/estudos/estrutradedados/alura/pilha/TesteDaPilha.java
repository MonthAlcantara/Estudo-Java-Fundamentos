package io.github.monthalcantara.estudos.estrutradedados.alura.pilha;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Stack;

public class TesteDaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println(pilha);
        pilha.remove();

        pilha.insere("Nome 0");
        System.out.println(pilha);
        pilha.insere("Nome 1");
        System.out.println(pilha);
        pilha.insere("Nome 2");
        System.out.println(pilha);
        pilha.insere("Nome 3");

        System.out.println(pilha);

        pilha.remove();

        System.out.println(pilha);

        pilha.remove();

        System.out.println(pilha);

        pilha.remove();

        System.out.println(pilha);

        pilha.remove();

        System.out.println(pilha);

        Stack<String> nomes = new Stack<>();

        nomes.push("r");
        nomes.push("o");
        nomes.push("i");
        nomes.push("n");
        nomes.push("u");
        nomes.push("J");

        System.out.println(nomes);
        for(int i = nomes.size(); i > 0; i-- ){
            // poderia ter passado o pop aqui pois ele também retorna o valor mas a ideia é
            // testar que o peek retorna o ultimo valor da pilha mas não o remove
            System.out.print(nomes.peek());
            nomes.pop();
        }

    }
}
