package io.github.monthalcantara.estudos.thread;

public class BanheiroTest {
    public static void main(String[] args) {
        Banheiro b = new Banheiro();
            new Thread(() -> b.numero1(), "Joao").start();

            new Thread(() -> b.numero2(), "Pedro").start();
        }
}
