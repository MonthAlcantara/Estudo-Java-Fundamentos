package io.github.monthalcantara.estudos.estrutradedados.alura.array;

import io.github.monthalcantara.estudos.estrutradedados.alura.Aluno;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public Aluno pega(int posicao) {
        if (posicaoOcupada(posicao)) {
            return alunos[posicao];
        }
       throw new IllegalArgumentException("Posição inválida");
    }

    // Quero saber se nessa posção possui algo diferente de null
    private boolean posicaoOcupada(int posicao) {
        return totalDeAlunos > posicao && posicao >= 0;
    }
    private boolean posicaoValida(int posicao) {
        return totalDeAlunos >= posicao && posicao >= 0;
    }

    public void remove(int posicao) {

    }
    /*
    Esse tipo de código gera o O(N) ou seja eu preciso varrer toda a
        lista até achar o que desejo.
    public boolean contem(Aluno aluno){
        for(Aluno a : this.alunos){
            if(aluno.equals(a)){
                return true;
            }
        }
        return false;
    }
    */

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
