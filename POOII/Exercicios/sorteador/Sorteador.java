package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Sorteador <T>{
    private List<T> elementos;

    public Sorteador(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        if (elementos.isEmpty()) {
            return null;
        }
        int indiceSorteado = ThreadLocalRandom.current().nextInt(elementos.size());
        T sorteado = elementos.remove(indiceSorteado);
        return sorteado;
    }



    public boolean possuiElementos () {
        return !elementos.isEmpty();
    }




}
