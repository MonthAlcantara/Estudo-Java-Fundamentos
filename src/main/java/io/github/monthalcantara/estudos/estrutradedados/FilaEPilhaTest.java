package io.github.monthalcantara.estudos.estrutradedados;

public class FilaEPilhaTest {
        public static void main(String[] args) {
            System.out.println("Teste Pilha - Ultimo a entrar é o primeiro a sair");
            Pilha pilha = new Pilha();
            pilha.p.add(1);
            pilha.imprimeLista();
            System.out.println(" ");
            pilha.p.add(2);
            pilha.imprimeLista();
            System.out.println(" ");
            pilha.p.add(3);
            pilha.imprimeLista();
            System.out.println(" ");
            pilha.p.add(4);
            pilha.imprimeLista();
            pilha.remove();
            System.out.println(" ");
            pilha.imprimeLista();
            System.out.println(" ");
            pilha.remove();
            pilha.imprimeLista();
            System.out.println(" ");
            pilha.remove();
            pilha.imprimeLista();
            pilha.remove();
            System.out.println(" ");
            pilha.imprimeLista();
            System.out.println(" Fim Teste Pilha");
        }
    }

