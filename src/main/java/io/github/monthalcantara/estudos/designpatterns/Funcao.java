package io.github.monthalcantara.estudos.designpatterns;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Funcao {
    public static void main(String[] args) {
        System.out.println(fatorial(5));

        List<Integer> nums = Arrays.asList(1,2,7);
        Optional<Integer> reduce = nums.stream().reduce( (ac, n) -> ac + n);
        System.out.println(reduce.get());
    }

    public static int fatorial(Integer fibo){
        if( fibo == 1){
            return 1;
        }
        return fibonacci().apply(fibo);
    }
    public static Function<Integer, Integer> fibonacci(){
        return n -> n * (n-1);
    }
}
