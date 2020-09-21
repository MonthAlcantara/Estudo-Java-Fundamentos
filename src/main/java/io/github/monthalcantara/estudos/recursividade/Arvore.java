package io.github.monthalcantara.estudos.recursividade;

public class Arvore {
    private Elemento elemento;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() {
    }

    public Arvore(Elemento ele) {
        this.elemento = ele;
    }

    public void inserirElemento(Elemento novoElemento){
        if(this.isEmpty()){
            this.elemento = novoElemento;
        }else if(this.elemento.getValor() >= novoElemento.getValor()){ // inserindo na descendência esquerda
            if(this.esquerda.isEmpty()){
                this.esquerda = new Arvore(novoElemento);
            }else{
                this.esquerda.inserirElemento(novoElemento);
            }
        }else if (this.elemento.getValor() <= novoElemento.getValor()){
            if(this.direita.isEmpty()){
            this.direita = new Arvore(novoElemento);
            }else{
                this.direita.inserirElemento(novoElemento);
            }
        }
    }

    public boolean isEmpty(){
        return (this.elemento == null);
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Arvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }

    public Arvore getDireita() {
        return direita;
    }

    public void setDireita(Arvore direita) {
        this.direita = direita;
    }
}
