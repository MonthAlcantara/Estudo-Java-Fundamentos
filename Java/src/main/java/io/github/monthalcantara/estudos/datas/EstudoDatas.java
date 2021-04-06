package io.github.monthalcantara.estudos.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.*;

public class EstudoDatas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println("LocalDate antes da formatação: " + hoje);

        DateTimeFormatter formatter = ofPattern("dd/MM/yyyy");
        String hojeFormatado = hoje.format(formatter);
        System.out.println("LocalDate depois da formatação: " + hojeFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println("LocalDateTime antes da formatação: " + agora);

        formatter = ofPattern("dd/MM/yyyy HH:mm:ss");
        String agoraFormatado = agora.format(formatter);
        System.out.println("LocalDateTime depois da formatação: " + agoraFormatado);
    }
}
