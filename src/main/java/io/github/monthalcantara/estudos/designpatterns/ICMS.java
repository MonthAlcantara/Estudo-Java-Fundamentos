package io.github.monthalcantara.estudos.designpatterns;

public class ICMS implements Imposto{
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
