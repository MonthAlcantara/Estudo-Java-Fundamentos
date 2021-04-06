package io.github.monthalcantara.estudos.designpatterns.interpreter;

public class Numero implements Expressao {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return numero;
    }
}
