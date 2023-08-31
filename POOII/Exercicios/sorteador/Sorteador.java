package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {
    private List<String> elementos;

    public Sorteador (List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        Random NomeAleatorio = new Random();
        int index = NomeAleatorio.nextInt(elementos.size());
        String nomeSorteado = elementos.get(index);
        elementos.remove(index);
        return nomeSorteado;
    }

    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("Bruno");
        elementos.add("Vinícius");
        elementos.add("Pedro");
        elementos.add("João");
        Sorteador sorteador = new Sorteador(elementos);
        System.out.println("O nome sorteado foi " + sorteador.sortear());
    }
}


