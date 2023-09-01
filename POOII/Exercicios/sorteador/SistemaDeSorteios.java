package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("Bruno");
        elementos.add("Vinícius");
        elementos.add("Pedro");
        elementos.add("Carlos");
        elementos.add("Ana");
        elementos.add("Jorge");
        elementos.add("Miguel");
        Sorteador sorteador = new Sorteador(elementos);

        System.out.println(sorteador.agrupar(2));
        System.out.println(sorteador.sortear());
    }
}
