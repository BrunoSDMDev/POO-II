package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("João");
        elementos.add("Maria");
        elementos.add("Pedro");
        elementos.add("Ana");
        Sorteador sorteador = new Sorteador(elementos);
        System.out.println(sorteador.sortear());
        System.out.println(sorteador.agrupar(3));
    }
}
