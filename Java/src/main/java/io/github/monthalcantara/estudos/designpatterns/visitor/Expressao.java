package io.github.monthalcantara.estudos.designpatterns.visitor;

public interface Expressao {
    int avalia();

    void aceita(ImpressoraVisitor visitor);
}
