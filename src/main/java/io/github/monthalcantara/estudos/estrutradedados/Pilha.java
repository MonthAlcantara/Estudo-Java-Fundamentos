package io.github.monthalcantara.estudos.estrutradedados;

import java.util.ArrayList;
import java.util.List;

public class Pilha {

    List<Integer> p = new ArrayList<>();

    public void insere(Integer num) {
        this.p.add(num);
    }

    public void remove() {
        if (this.estaVazia()) {
            System.out.println("Não existem elementos nessa pilha");
        }
        int elementos = this.qtdElementos();
        this.p.remove(elementos - 1);
    }

    public int qtdElementos() {
        return this.p.size();
    }

    public void imprimeLista() {
        this.p.stream().forEach(System.out::print);
    }

    public boolean estaVazia() {
        return this.p.isEmpty();
    }
}
