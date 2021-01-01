package io.github.monthalcantara.estudos.string;

public class StringBuilderTest {

    public static void main(String[] args) {

        /*
        * Diferente do String o StringBuilder cria "Strings" mutáveis onde
        * consigo alterar o objeto
        * */
        StringBuilder builder = new StringBuilder("help");
        builder.append("-");
        builder.append("me");

        System.out.println(builder);// help-me
        System.out.println(builder.charAt(2)); // "-"

        builder.deleteCharAt(2);
        System.out.println(builder); // hep-me

    }

}
