package io.github.monthalcantara.estudos.designpatterns.visitor;

public class Subtracao implements Expressao {
    private Expressao numeroEsquerda;
    private Expressao numeroDireita;

    public Subtracao(Expressao numeroEsquerda, Expressao numeroDireita) {
        this.numeroEsquerda = numeroEsquerda;
        this.numeroDireita = numeroDireita;
    }

    @Override
    public int avalia() {
        int expressao1 = numeroEsquerda.avalia();
        int expressao2 = numeroDireita.avalia();
        return expressao1 - expressao2;
    }

    @Override
    public void aceita(ImpressoraVisitor visitor) {

    }

}
