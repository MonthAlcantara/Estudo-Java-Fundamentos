package io.github.monthalcantara.estudos.thread;

public class Banheiro {

    private String nome;

    public void numero1() {
        synchronized (this) {
        nome = Thread.currentThread().getName();
            System.out.println(nome + " Entrou no banheiro");
            System.out.println(nome + " Fez coisa rápida");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " Lavou as mãos");
            System.out.println(nome + " Saiu do banheiro");
        }
    }

    public void numero2() {
        synchronized (this) {
        nome = Thread.currentThread().getName();
            System.out.println(nome + " Entrou no banheiro");
            System.out.println(nome + " Fez coisa demorada");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " Lavou as mãos");
            System.out.println(nome + " Saiu do banheiro");
        }
    }
}
