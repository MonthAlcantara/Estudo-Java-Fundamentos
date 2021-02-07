package io.github.monthalcantara.estudos.lambdas;

public class RegraTempoEmprego extends Regra {

    private final int MINIMO_TEMPO_EMPREGADO_PARA_APROVACAO = 1;

    public RegraTempoEmprego() {
        super(null);
    }

    public RegraTempoEmprego(Regra proximaRegra) {
        super(proximaRegra);
    }

    @Override
    protected boolean aplicar(Cliente cliente) {
        if (cliente.getTempoEmpregado() > MINIMO_TEMPO_EMPREGADO_PARA_APROVACAO) {
            return aplicarProximaRegra(cliente);
        }
        return false;
    }
}
