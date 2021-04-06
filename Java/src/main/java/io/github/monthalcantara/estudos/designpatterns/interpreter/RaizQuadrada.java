package io.github.monthalcantara.estudos.designpatterns.interpreter;

public class RaizQuadrada implements Expressao{
    private Expressao expressao;

    public RaizQuadrada(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public int avalia() {
        int valor = expressao.avalia();
        return (int) Math.sqrt(valor);
    }
}
