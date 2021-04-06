package io.github.monthalcantara.estudos.estrutradedados.alura.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> nomes = new LinkedList<>();

    // Se a pilha estiver vazia eu adiciono na posição zero
    // Se não estiver vazia eu adiciono na próxima posição após o ultimo elemento
    // Lembrando que o ultimo elemento é tamanho - 1
    public void insere(String nome) {
        if (vazio()) {
            nomes.add(0, nome);
        } else {
            int size = nomes.size();
            nomes.add(size, nome);
        }
    }

    // Como  o ínidce começa com zero, o ultimo indice é o tamanho - 1
    // E assim eu removo a ultima posição
    public void remove() {
        if (vazio()) {
            System.out.println("Essa pilha esta vazia");
        } else {
            int size = nomes.size() - 1;
            nomes.remove(size);
        }
    }

    public boolean vazio() {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "nomes=" + nomes +
                '}';
    }

    public List<String> getNomes() {
        return nomes;
    }


}
