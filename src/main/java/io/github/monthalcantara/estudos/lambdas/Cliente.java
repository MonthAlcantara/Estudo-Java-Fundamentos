package io.github.monthalcantara.estudos.lambdas;

public class Cliente {

    private String nome;
    private double salario;
    private int tempoEmpregado;
    private boolean restricoesSPC;
    private boolean pagamentosAtraso;

    public Cliente(String nome,
                   double salario,
                   int temporEmpregado,
                   boolean restricoesSPC,
                   boolean pagamentosAtraso) {
        this.nome = nome;
        this.salario = salario;
        this.tempoEmpregado = temporEmpregado;
        this.restricoesSPC = restricoesSPC;
        this.pagamentosAtraso = pagamentosAtraso;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getTempoEmpregado() {
        return tempoEmpregado;
    }

    public boolean isNomeLimpo() {
        return !restricoesSPC;
    }

    public boolean isPagamentosEmDia() {
        return !pagamentosAtraso;
    }
}
