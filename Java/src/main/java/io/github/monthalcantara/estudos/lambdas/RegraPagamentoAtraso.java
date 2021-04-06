package io.github.monthalcantara.estudos.lambdas;

public class RegraPagamentoAtraso extends Regra {

    public RegraPagamentoAtraso() {
        super(null);
    }

    public RegraPagamentoAtraso(Regra proximaRegra) {
        super(proximaRegra);
    }

    @Override
    protected boolean aplicar(Cliente cliente) {
        if (cliente.isPagamentosEmDia()) {
            return aplicarProximaRegra(cliente);
        }
        return false;
    }
}
