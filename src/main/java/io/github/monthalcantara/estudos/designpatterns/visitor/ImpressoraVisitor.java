package io.github.monthalcantara.estudos.designpatterns.visitor;

public class ImpressoraVisitor {

    public void visitaSoma(Soma soma){
        System.out.print("(");

        soma.getNumeroEsquerda().aceita(this);

        System.out.print("+");

        soma.getNumeroDireita().aceita(this);

        System.out.print(")");

    }

    public void visitaMultiplicacao(Multiplicacao multiplicacao) {
        System.out.print("(");

        multiplicacao.getEsquerda().aceita(this);

        System.out.print("*");

        multiplicacao.getDireita().aceita(this);

        System.out.print(")");

    }

    public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
        System.out.print("(");
        raizQuadrada.avalia();
        System.out.print(")");
    }
}
