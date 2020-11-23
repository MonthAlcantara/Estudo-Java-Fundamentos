package io.github.monthalcantara.estudos.generics.heranca;

import io.github.monthalcantara.estudos.generics.comgenerics.CaixaObjeto;

/**
 * Podemos atrasar a definição dos tipo:
 * 1 - Posso não definir o tipo ao Instanciar iae o tipo vai ser definido como Object
 * 2 - Posso definir o tipo no momento da instanciação
 * 3 - Posso definir isso por Herança
 */
    public class CaixaInt extends CaixaObjeto<Integer> {

    }

/**
 * >>>> public class CaixaInt<X> extends CaixaObjeto<X> <<<<
 * Fazendo a herança dessa forma eu continuo não definindo o tipo pra classe filha
 * e deixando aberto pra quem instanciar CaixaInt definir qual o tipo
*/
/**
 * >>>> public class CaixaInt extends CaixaObjeto<Integer> <<<<
 * Fazendo a herança dessa forma eu ja defino o tipo pra classe filha
 * e quem instanciar CaixaInt vai ter que trabalhar com os métodos recebendo o tipo Integer
*/

