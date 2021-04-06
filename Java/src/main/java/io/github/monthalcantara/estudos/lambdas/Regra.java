package io.github.monthalcantara.estudos.lambdas;

import java.util.Objects;

public abstract class Regra {

    protected Regra proximaRegra;

    Regra(Regra proximaRegra) {
        this.proximaRegra = proximaRegra;
    }

    protected abstract boolean aplicar(Cliente cliente);

    protected boolean aplicarProximaRegra(Cliente cliente) {
        return Objects.isNull(proximaRegra) || proximaRegra.aplicar(cliente);

    }
}
