package io.github.monthalcantara.estudos.base64;

import java.util.Base64;

public class Decode {

    public static void main(String[] args) {
        String mensagemCodificada = "VGVzdGFuZG8gQmFzZTY0";
        //getDecoder: Estou obtendo um decodificador do Base64.
        byte[] decode = Base64.getDecoder().decode(mensagemCodificada.getBytes());
        String mensagemDecodificada = new String(decode);
        System.out.println(mensagemDecodificada);
        /*
         * Não utilize Base64 como uma camada de segurança,
         *  pois é utilizado apenas para transferir dados com caracteres especiais,
         *  como por exemplo, uma chave RSA, etc.
         */
    }
}
