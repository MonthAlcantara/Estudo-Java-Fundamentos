package io.github.monthalcantara.estudos.lambdas;

public class RegraSPC extends Regra {

    public RegraSPC() {
        super(null);
    }

    public RegraSPC(Regra proximaRegra) {
        super(proximaRegra);
    }

    @Override
    public boolean aplicar(Cliente cliente) {
        if (cliente.isNomeLimpo()) {
            return aplicarProximaRegra(cliente);
        }
        return false;
    }
}
