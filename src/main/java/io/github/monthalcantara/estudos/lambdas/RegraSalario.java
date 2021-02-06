package io.github.monthalcantara.estudos.lambdas;

public class RegraSalario extends Regra {
    public RegraSalario() {
        super(null);
    }

    public RegraSalario(Regra proximaRegra) {
        super(proximaRegra);
    }

    @Override
    protected boolean aplicar(Cliente cliente) {
        if (cliente.getSalario() >= 2000) {
            return aplicarProximaRegra(cliente);
        }
        return false;
    }
}
