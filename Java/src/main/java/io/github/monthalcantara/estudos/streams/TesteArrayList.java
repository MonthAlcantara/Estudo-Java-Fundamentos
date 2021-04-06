package io.github.monthalcantara.estudos.streams;

import io.github.monthalcantara.estudos.bytebank.model.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new LinkedList<>();

        Funcionario func1 = new Funcionario(0, "Funcionario 0", LocalDate.of(1990,
                10,
                24));
        funcionarios.add(func1);

        Funcionario func2 = new Funcionario(1, "Funcionario 1", LocalDate.of(1987,
                10,
                26));
        funcionarios.add(func2);

        boolean existe = funcionarios.contains(func1);
//
//        System.out.println(func1.equals(func2));
//
//        System.out.println(existe);

        System.out.println( funcionarios.indexOf(func2));
        funcionarios.remove(func1);
        System.out.println(funcionarios.indexOf(func2));



    }
}
