package io.github.monthalcantara.estudos.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class EstudoArrays {

    public static void main(String[] args) {

        String[] array1 = new String[]{"a", "b", "c", "d"};
        String[] array2 = new String[]{"e", "f", "g", "h"};

        String[] arraysConcatenados = ArrayUtils.addAll(array1, array2);

        System.out.println("Resultado final: " + Arrays.toString(arraysConcatenados));

    }
}
