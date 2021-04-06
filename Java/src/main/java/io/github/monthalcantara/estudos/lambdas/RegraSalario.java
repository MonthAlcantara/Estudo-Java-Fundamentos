package io.github.monthalcantara.estudos.lambdas;

public class RegraSalario extends Regra {

    private final double MINIMO_SALARIO_PARA_APROVACAO = 2000;

    public RegraSalario() {
        super(null);
    }

    public RegraSalario(Regra proximaRegra) {
        super(proximaRegra);
    }

    @Override
    protected boolean aplicar(Cliente cliente) {
        if (cliente.getSalario() >= MINIMO_SALARIO_PARA_APROVACAO) {
            return aplicarProximaRegra(cliente);
        }
        return false;
    }
}
