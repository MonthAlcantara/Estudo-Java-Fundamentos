package io.github.monthalcantara.estudos.lambdas;

public class RegrasPredicateTest {

    public static void validarCliente(Cliente cliente, Regra regra) {
        String resultado = regra.aplicar(cliente) ? "aceito" : "recusado";
        System.out.printf("Resultado : %s \n", resultado);
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cliente01",
                2500,
                0,
                false,
                true);

        validarCliente(cliente,
                new RegraSalario(
                        new RegraSPC()));

        validarCliente(cliente,
                new RegraSalario(
                        new RegraSPC(
                                new RegraPagamentoAtraso())));

        validarCliente(cliente,
                new RegraSalario(
                        new RegraSPC(
                                new RegraPagamentoAtraso(
                                        new RegraTempoEmprego()))));

    }
}
