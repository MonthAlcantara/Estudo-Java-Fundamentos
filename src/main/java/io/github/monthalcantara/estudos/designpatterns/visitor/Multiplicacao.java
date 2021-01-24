package io.github.monthalcantara.estudos.designpatterns.visitor;

public class Multiplicacao implements Expressao {
    private Expressao direita;
    private Expressao esquerda;

    public Multiplicacao(Expressao direita, Expressao esquerda) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public int avalia() {
        int expressaoDireta = direita.avalia();
        int expressaoEsquerda = esquerda.avalia();
        return expressaoEsquerda * expressaoDireta;
    }

    @Override
    public void aceita(ImpressoraVisitor visitor) {
        visitor.visitaMultiplicacao(this);
    }

    public Expressao getDireita() {
        return direita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }
}
