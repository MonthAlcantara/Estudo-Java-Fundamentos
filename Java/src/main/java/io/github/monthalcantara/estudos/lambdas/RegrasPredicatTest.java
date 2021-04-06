package io.github.monthalcantara.estudos.lambdas;

import java.util.function.Predicate;

public class RegrasPredicatTest {
    /*
     * Regras Para aprovação:
     *
     *  Salário maior que 2000,00
     *  Sem nome no SPC
     *  Sem Pagamentos em Atraso
     *  Mais de 1 ano empregado
     *
     **/
    public static void validar(Cliente cliente, Predicate<Cliente> regra) {
        String resultado = regra.test(cliente) ? "aceito" : "recusado";
        System.out.printf("Resultado : %s \n", resultado);
    }

    public static void main(String[] args) {
        Predicate<Cliente> regraNomeSujo = Cliente::isNomeLimpo;
        Predicate<Cliente> regraPagamentoAtrasado = Cliente::isPagamentosEmDia;
        Predicate<Cliente> regraSalario = cliente -> cliente.getSalario() >= 2000;
        Predicate<Cliente> regraTempoEmpregado = cliente -> cliente.getTempoEmpregado() > 1;

        Cliente cliente = new Cliente("Cliente01",
                2500,
                0,
                false,
                true);

        validar(cliente, regraSalario.and(regraNomeSujo));
        validar(cliente, regraSalario.and(regraNomeSujo).and(regraPagamentoAtrasado));
        validar(cliente, regraSalario.and(regraNomeSujo).and(regraTempoEmpregado));

    }
}
