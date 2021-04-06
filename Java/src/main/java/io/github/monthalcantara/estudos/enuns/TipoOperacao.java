package io.github.monthalcantara.estudos.enuns;

import java.util.Objects;

public enum TipoOperacao {

    SOMAR("+", 1), MULTIPLICAR("*", 2);

    private String descricao;

    private int codigo;

    TipoOperacao(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public TipoOperacao toEnum(String descricao) {
        if (Objects.isNull(descricao)) {
            return null;
        }
        for (TipoOperacao t : TipoOperacao.values()) {
            if (descricao.equals(t.getDescricao())) {
                return t;
            }
        }
        throw new IllegalArgumentException("Não existe enum com a descição informada");
    }
}
