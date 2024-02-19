package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ejemplo {
    public static void main(String[] args) {
        Function<Integer, Boolean> isEven = new Function<Integer, Boolean>() {
            @Override
            public Boolean apply(Integer x) {
                return x % 2 == 0;
            }
        };
        Function<Integer, Boolean> isEven2 = x -> x % 2 == 0;
        Predicate<Integer> isEven4 = x -> x % 2 == 0;
        System.out.println(isEven.apply(3));
        System.out.println(isEven.apply(6));
        System.out.println(isEven2.apply(3));
        System.out.println(isEven2.apply(6));
        System.out.println(isEven3(3));
        System.out.println(isEven3(6));
        System.out.println(isEven4.test(3));
        System.out.println(isEven4.test(6));
        Predicate<Estuduante> paso = x -> x.getNota() > 3.5;
        Estuduante memo = new Estuduante(4);
        System.out.println("memo pasó? -> " + paso.test(memo));
        memo.setNota(3.4);
        System.out.println("memo pasó? -> " + paso.test(memo));


    }
    private static Boolean isEven3(Integer x) {
        return x % 2 == 0;
    }

    static class Estuduante{
        private double nota;
        public Estuduante(double nota){
            this.nota = nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        public double getNota() {
            return nota;
        }
    }
    
}
