package POOII.Exercicios.sorteador;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public abstract class SorteadorAbstrato<T> implements Sorteador<T> {

    private final List<T> elementos;

    public SorteadorAbstrato(List<T> elementos) {
        this.elementos = elementos;
    }

    public RecordPair<T, Integer> sortear() {
        if (elementos.isEmpty()) {
            return null;
        }

        int indiceSorteado = getIndiceSorteado();
        T elementoSorteado = elementos.remove(indiceSorteado);
        return new RecordPair<>(elementoSorteado, indiceSorteado);

    }

    protected abstract int getIndiceSorteado();


    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }

    protected int quantidadeElementos() {
        return elementos.size();
    }

}