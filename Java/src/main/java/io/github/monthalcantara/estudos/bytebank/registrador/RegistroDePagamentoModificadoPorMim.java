package io.github.monthalcantara.estudos.bytebank.registrador;

import io.github.monthalcantara.estudos.bytebank.model.Pagamento;
import io.github.monthalcantara.estudos.bytebank.model.Tipo;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamentoModificadoPorMim {

    private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();

    public void registra(List<Pagamento> pagamentos) {
        for (int i = 0; i < pagamentos.size(); i++) {
            Pagamento p = pagamentos.get(i);
            verificaFormaPagamento(p);
            registraPagamento(p);
        }
        imprimePagamentos();
    }

    private void imprimePagamentos() {
        if (!PAGAMENTOS.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (int i = 0; i < PAGAMENTOS.size(); i++) {
                System.out.println(PAGAMENTOS.get(i));
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }

    private void verificaFormaPagamento(Pagamento p) {
        if (p.getTipo().equals(Tipo.CREDITO)) {
            p.setValor(p.getValor() * 1.02);
        }
        if (p.getTipo().equals(Tipo.DEBITO)) {
            p.setValor(p.getValor() * 1.001);
        }
    }

    private void registraPagamento(Pagamento p) {
        PAGAMENTOS.add(p);
        System.out.println("Pagamento realizado " + p);
    }

}
