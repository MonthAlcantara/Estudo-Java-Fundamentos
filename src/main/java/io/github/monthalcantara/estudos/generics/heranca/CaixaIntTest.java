package io.github.monthalcantara.estudos.generics.heranca;

import io.github.monthalcantara.estudos.generics.comgenerics.CaixaObjeto;

public class CaixaIntTest {

    public static void main(String[] args) {
        //Como eu ja defini o "A" ao fazer CaixaInt estender CaixaObjeto<Integer>, Ele vai trabalhar em cima do Integer
        CaixaInt caixaObjeto = new CaixaInt();

        caixaObjeto.guardar(300);

        Integer abrir = caixaObjeto.abrir();
        System.out.println(abrir);
    }
}
