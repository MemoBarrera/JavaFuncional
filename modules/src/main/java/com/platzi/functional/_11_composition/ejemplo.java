package com.platzi.functional._11_composition;

import java.util.function.Function;
import java.util.function.Predicate;

public class ejemplo {
    public static void main(String[] args) {
        Predicate<Integer> p = x -> x == 0;
        Function<Integer, Integer> suma = a -> a + 2;
        Function<Integer, Integer> multiplicacion =
            suma.compose(x -> {return (!p.test(x)) ? (x * 2) : 2;});
        Function<Integer, Integer> alCuadrado =
                multiplicacion.andThen(x -> x * x);

        System.out.println(alCuadrado.apply(0));
    }
}
