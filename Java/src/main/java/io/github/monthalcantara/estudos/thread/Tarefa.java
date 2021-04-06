package io.github.monthalcantara.estudos.thread;

public class Tarefa implements Runnable {
    @Override
    public void run() {
        System.out.println("De dentro da Thread");
    }
}
