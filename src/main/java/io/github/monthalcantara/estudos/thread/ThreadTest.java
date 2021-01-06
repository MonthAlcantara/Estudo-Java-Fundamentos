package io.github.monthalcantara.estudos.thread;

public class ThreadTest {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        Thread t = new Thread(tarefa);
//        try {
//            t.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t.start();

         new Thread(() -> System.out.println("De dentro da Thread do Main")).start();
    }
}
