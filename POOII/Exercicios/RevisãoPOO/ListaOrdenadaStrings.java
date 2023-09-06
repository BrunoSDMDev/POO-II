package POOII.Exercicios.RevisãoPOO;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaOrdenadaStrings {
    public static class Main {
        public static void main(String[] args){
//            List<String> listaOrdenadaDeStrings = new ArrayList<>();
//            listaOrdenadaDeStrings.add("Z");
//            listaOrdenadaDeStrings.add("Y");
//            listaOrdenadaDeStrings.add("X");
//            listaOrdenadaDeStrings.add("W");
//            listaOrdenadaDeStrings.add("V");
//            listaOrdenadaDeStrings.add("U");
//            listaOrdenadaDeStrings.add("T");
//            listaOrdenadaDeStrings.add("S");
//            listaOrdenadaDeStrings.add("R");
//            listaOrdenadaDeStrings.add("Q");
//            listaOrdenadaDeStrings.add("P");
//            listaOrdenadaDeStrings.add("O");
//            listaOrdenadaDeStrings.add("N");
//            listaOrdenadaDeStrings.add("M");
//            listaOrdenadaDeStrings.add("L");
//            listaOrdenadaDeStrings.add("K");
//            listaOrdenadaDeStrings.add("J");
//            listaOrdenadaDeStrings.add("I");
//            listaOrdenadaDeStrings.add("H");
//            listaOrdenadaDeStrings.add("G");
//            listaOrdenadaDeStrings.add("F");
//            listaOrdenadaDeStrings.add("E");
//            listaOrdenadaDeStrings.add("D");
//            listaOrdenadaDeStrings.add("C");
//            listaOrdenadaDeStrings.add("B");
//            listaOrdenadaDeStrings.add("A");
//
//            Collections.sort(listaOrdenadaDeStrings);
//            System.out.println(listaOrdenadaDeStrings);
//
//            Integer vinteECinco = 25;
//            Integer cinquenta = 50;
//            Integer dez = 10;
//            List<Integer> listaNumeros = new ArrayList<>(List.of(vinteECinco, cinquenta, dez));
//            System.out.println("Lista desornenada %s".formatted(listaNumeros));
//            Collections.sort(listaNumeros);
//            System.out.println("Lista ornenada %s".formatted(listaNumeros));
//
//            System.out.println("10.compareTo(25) == %s".formatted(dez.compareTo(vinteECinco)));
//            System.out.println("25.compareTo(10) == %s".formatted(vinteECinco.compareTo(dez)));
//            System.out.println("10.compareTo(10) == %s".formatted(dez.compareTo(dez)));


            List<Pessoa> listaPessoas = new ArrayList<>();
            Pessoa vini = new Pessoa("Vini", LocalDate.of(1991, Month.DECEMBER, 15));
            Pessoa jason = new Pessoa("Jason", LocalDate.of(1995, Month.JULY, 24));
            Pessoa amanda = new Pessoa("Amanda", LocalDate.of(1992, Month.APRIL, 12));
            Pessoa zed = new Pessoa("Zed", LocalDate.of(1999, Month.JANUARY, 20));

            listaPessoas.addAll(List.of(zed, amanda,jason, vini));
            System.out.println("Lista de pessoas desordenada %s".formatted(listaPessoas));
            Collections.sort(listaPessoas);
            System.out.println("Lista de pessoas ordenada por idade (menor para o maior)%s".formatted(listaPessoas));

            Comparator<Pessoa> comparadorDePessoasPorNome = Comparator.comparing(Pessoa::getNome);
            Collections.sort(listaPessoas, comparadorDePessoasPorNome);
            System.out.println("Lista de pessoas ordenada por ordem alfabética %s".formatted(listaPessoas));



        }


    }
    }
