package io.github.monthalcantara.estudos.generics.comgenerics;

/**
 *
 * Informo que estarei recebendo um tipo "A" (Que no caso pode ser qualquer tipo e poderia ser qqr letra)
 * É a mesma coisa que acontece no List. Quando faço o List<String> , o List foi definido com um generics
 * List<A>, por exemplo e quando quero uma lista de String, eu substituo o "A" pelo String
 */
public class CaixaObjeto<A> {

    /**
     * Agora eu posso em vez de passar um tipo existente, passar o "A" que vai ser o tipo
     * que será definido na hora da instanciação do caixaObjeto
     */
    private A coisa;

    public void guardar(A coisa) {
        this.coisa = coisa;
    }

    public A abrir() {
        return coisa;
    }
}
