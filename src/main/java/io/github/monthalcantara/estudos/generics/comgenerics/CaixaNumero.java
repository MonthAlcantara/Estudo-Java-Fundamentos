package io.github.monthalcantara.estudos.generics.comgenerics;

/**
 * Criei uma Classe CaixaNumero e Disse que o Tipo dela deve extender a classe Number (int, double...etc)
 * porém eu não disse qual seria o tipo. Eu apenas  limitei as possibilidades entre as filhas de Number
 * Quem instanciar vai ter de dizer qual filha de Number será o tipo
 * @param <N>
 */
public class CaixaNumero<N extends Number> extends CaixaObjeto<N> {
}
