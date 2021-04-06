package io.github.monthalcantara.estudos.base64;

import java.util.Base64;

public class Encode {
    public static void main(String[] args) {
        String mensagem = "Testando Base64";
        //Como Base64 é muito utilizado existe uma classe nativa do Java para isto, a Base64
        //getEncoder: Estou obtendo um codificador do Base64.
        String mensagemCodificada = Base64.getEncoder().encodeToString(mensagem.getBytes());
        System.out.println(mensagemCodificada);
    }

}
