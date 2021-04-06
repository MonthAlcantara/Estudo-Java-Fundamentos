package io.github.monthalcantara.estudos.streams;

import io.github.monthalcantara.estudos.bytebank.model.Funcionario;

import java.time.LocalDate;
import java.util.stream.Stream;

public class TesteArrayReferencia {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[5]; // Criando Array de referencia

        funcionarios[0] = new Funcionario(0, "Funcionario 0", LocalDate.of(1990,
                10,
                24));

        Funcionario funcionario1 = new Funcionario(1, "Funcionario 1", LocalDate.of(1987,
                10,
                26));
        funcionarios[1] = funcionario1;

        Funcionario teste = new Funcionario();
        teste = funcionario1;
        funcionarios[2] = teste; //funcionario1;//Copiando a referencia do objeto no HEAP
        funcionarios[2].setId(25);
        System.out.println(String.format("isEqual? %s",funcionarios[2].equals(funcionario1)));
        Stream.of(funcionarios).forEach(System.out::println);

        System.out.println("Teste referencia :" + teste.testeReferencia());

    }
}
