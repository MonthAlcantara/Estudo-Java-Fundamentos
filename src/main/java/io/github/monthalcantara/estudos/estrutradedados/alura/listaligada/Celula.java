package io.github.monthalcantara.estudos.estrutradedados.alura.listaligada;

// Celula representa um elemento qqr que vou adicionar a lista
public class Celula {
    /*
    Cada elemento salvo na lista terá o elemento em si
    e terá também o endereço da próxima célula da lista
     */
    private Object elemento;
    private Celula proxima;

    public Celula(Object elemento, Celula proxima) {
        this.elemento = elemento;
        this.proxima = proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}
