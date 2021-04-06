package io.github.monthalcantara.estudos.estrutradedados.alura.array;

import io.github.monthalcantara.estudos.estrutradedados.alura.Aluno;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;


    public void adiciona(Aluno aluno) {
        garanteEspaco();
        alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    /*
        A ideia saqui é adicionar um elemento numa posição do array e mover os existentes para
        que o mesmo seja adicionado e não sobreponha os existentes
    */
    public void adiciona(int posicao, Aluno aluno) {
        garanteEspaco();
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        //  Com "totalDeAlunos - 1" eu tenho o valor do indice do ultimo componente do array
        //  Vou iterando e contando menos um a cada laço até que i seja menor que a posição informada
        // "i >= posicao" por que eu tenho que mover pra frente todos os lementos depois da posição...
        // ...inclusive o da posição para a entrada no novoque que desejo incluir
        for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
            // Na posição atual mais 1, ou seja, na proxima posição eu coloco o elemento da posição atual
            this.alunos[i + 1] = this.alunos[i];
        }
        //Adiciono na posição desejada
        this.alunos[posicao] = aluno;
        // Atualizo a contagem de elementos no array
        this.totalDeAlunos++;
    }

    public Aluno pega(int posicao) {
        if (posicaoOcupada(posicao)) {
            return this.alunos[posicao];
        }
        throw new IllegalArgumentException("Posição inválida");
    }

    // Quero saber se nessa posção possui algo diferente de null
    private boolean posicaoOcupada(int posicao) {
        return this.totalDeAlunos > posicao && posicao >= 0;
    }

    private boolean posicaoValida(int posicao) {
        return this.totalDeAlunos >= posicao && posicao >= 0;
    }

    /*
    Verifica se a lista está cheia alunos.length == totalDeAlunos
    caso esteja, dobra o tamanho da lista
     */
    public void garanteEspaco() {
        if (alunos.length == totalDeAlunos) {
            Aluno[] novaLista = new Aluno[alunos.length * 2];
            for (int i = 0; i < alunos.length; i++) {
                novaLista[i] = alunos[i];
            }
            alunos = novaLista;
        }
    }

    public void remove(int posicao) {

        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i <= this.totalDeAlunos - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        this.totalDeAlunos--;
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
