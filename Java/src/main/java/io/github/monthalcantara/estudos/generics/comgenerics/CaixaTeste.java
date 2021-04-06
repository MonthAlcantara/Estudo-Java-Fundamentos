package io.github.monthalcantara.estudos.generics.comgenerics;

public class CaixaTeste {
    public static void main(String[] args) {
        /**
         * Passando o tipo String no Lugar do "A" é como se eu tivesse substituindo tudo
         * o que tem "A" na clase caixaObjeto. Dessa forma o método aguardar vai esperar receber uma String
         * e o método abrir vai devolver um String
         */
        CaixaObjeto<String> caixaObjeto = new CaixaObjeto<>();
        caixaObjeto.guardar("segredo");
        System.out.println(caixaObjeto.abrir());

        /**
         * Usando a mesma classe CaixaObjeto para receber outro tipo no lugar do "A", agora o Double
         */
        CaixaObjeto<Double> caixaObjetoB = new CaixaObjeto<>();
        caixaObjetoB.guardar(2.3);
        System.out.println(caixaObjetoB.abrir());

        /**
         * Eu posso não dizer qual o Tipo do "A" mas nesse caso o Java vai assumir que
         * o "A" vai ser do tipo Object
         */
        CaixaObjeto caixaObjetoC = new CaixaObjeto();
        caixaObjetoC.guardar(25.00);

        Double caixaCDepoisDoCatch = (Double) caixaObjetoC.abrir();
        System.out.println(caixaCDepoisDoCatch);
    }
}
