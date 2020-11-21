package io.github.monthalcantara.estudos.bytebank;
import io.github.monthalcantara.estudos.bytebank.model.Pagamento;
import io.github.monthalcantara.estudos.bytebank.model.Tipo;
import io.github.monthalcantara.estudos.bytebank.registrador.RegistroDePagamento;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Pagamento almoco = new Pagamento(Tipo.DEBITO, 20, "Almoço no feijuca");
        Pagamento videogame = new Pagamento(Tipo.CREDITO, 1000, "PS4");

        List<Pagamento> pagamentoList = Arrays.asList(almoco, videogame);

        RegistroDePagamento registrador = new RegistroDePagamento();
        registrador.registra(pagamentoList);
    }

}
