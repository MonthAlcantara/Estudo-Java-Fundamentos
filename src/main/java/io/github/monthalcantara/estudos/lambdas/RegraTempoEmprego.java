package io.github.monthalcantara.estudos.lambdas;

public class RegraTempoEmprego extends Regra {

    public RegraTempoEmprego() {
        super(null);
    }

    public RegraTempoEmprego(Regra proximaRegra) {
        super(proximaRegra);
    }

    @Override
    protected boolean aplicar(Cliente cliente) {
        if (cliente.getTempoEmpregado() > 1) {
            return aplicarProximaRegra(cliente);
        }
        return false;
    }
}
