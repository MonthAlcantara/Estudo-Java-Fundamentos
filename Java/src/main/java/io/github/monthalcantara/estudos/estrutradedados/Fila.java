package io.github.monthalcantara.estudos.estrutradedados;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Integer> f = new ArrayList<>();

    public void insere(Integer num) {
        this.f.add(num);
    }

    public void remove() {
        if (this.estaVazia()) {
            System.out.println("Não existem elementos nessa fila");
            return;
        }
        this.f.remove(0);
    }

    public Integer peguePrimeiro() {
        return this.f.stream().findFirst().get();
    }


    public int qtdElementos() {
        return this.f.size();
    }

    public void imprimeLista() {
        this.f.stream().forEach(System.out::print);
    }

    public boolean estaVazia() {
        return this.f.isEmpty();
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.f.add(1);
        fila.imprimeLista();
        System.out.println(" ");
        fila.f.add(2);
        fila.imprimeLista();
        System.out.println(" ");
        fila.f.add(3);
        fila.imprimeLista();
        System.out.println(" ");
        fila.f.add(4);
        fila.imprimeLista();
        fila.remove();
        System.out.println(" ");
        fila.imprimeLista();
        System.out.println(" ");
        fila.remove();
        fila.imprimeLista();
        System.out.println(" ");
        fila.remove();
        fila.imprimeLista();
        fila.remove();
        System.out.println(" ");
        fila.imprimeLista();
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println("Fim da lista ");
        fila.imprimeLista();
    }
}
