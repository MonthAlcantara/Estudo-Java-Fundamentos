package io.github.monthalcantara.estudos.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    private int id;

    private String nome;

    private LocalDate dataNascimento;

    public Funcionario(int id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Funcionario() {

    }

    public boolean testeReferencia(){
        Funcionario outro = this;
        outro.setId(1000);
        return this.equals(outro);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
