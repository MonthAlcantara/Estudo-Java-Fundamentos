package io.github.monthalcantara.estudos.designpatterns.visitor;

public class RaizQuadrada implements Expressao {
    private Expressao expressao;

    public RaizQuadrada(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public int avalia() {
        int valor = expressao.avalia();
        return (int) Math.sqrt(valor);
    }

    @Override
    public void aceita(ImpressoraVisitor visitor) {
        visitor.visitaRaizQuadrada(this);
    }

    public Expressao getExpressao() {
        return expressao;
    }
}
