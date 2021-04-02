package io.github.monthalcantara.estudos.estrutradedados.alura.fila;

public class TesteDaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println(fila);
        fila.remove();

        fila.insere("Nome 0");
        System.out.println(fila);
        fila.insere("Nome 1");
        System.out.println(fila);
        fila.insere("Nome 2");
        System.out.println(fila);
        fila.insere("Nome 3");

        System.out.println(fila);

        fila.remove();

        System.out.println(fila);

        fila.remove();

        System.out.println(fila);

        fila.remove();

        System.out.println(fila);

        fila.remove();

        System.out.println(fila);

    }
}
