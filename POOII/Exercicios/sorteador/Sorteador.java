package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteador {
    private List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        Collections.shuffle(elementos);
        String sorteado = elementos.get(0);
        elementos.remove(0);
        return sorteado;
    }

    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("João");
        elementos.add("Maria");
        elementos.add("Pedro");
        elementos.add("Ana");
        Sorteador sorteador = new Sorteador(elementos);
        System.out.println(sorteador.sortear());
    }
}
