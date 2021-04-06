package io.github.monthalcantara.estudos.estrutradedados.alura.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<String> nomes = new LinkedList<>();

    public void insere(String nome) {
        nomes.add(0, nome);
    }

    public void remove() {
        if (vazio()) {
            System.out.println("Essa fila esta vazia");
        } else {
            nomes.remove(0);
        }
    }

    public boolean vazio() {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return "Fila{" +
                "nomes=" + nomes +
                '}';
    }

    public List<String> getNomes() {
        return nomes;
    }


}
