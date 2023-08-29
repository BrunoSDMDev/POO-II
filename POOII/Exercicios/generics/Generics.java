package POOII.Exercicios.generics;

import java.util.Collections;

public class Generics {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        System.out.println(maior(a,b));

    }
    private static String maior(String primeira, String segunda) {
        if (primeira.compareTo (segunda) > 0) {
            return primeira;
        } else {
            return segunda;
        }
    }
}
