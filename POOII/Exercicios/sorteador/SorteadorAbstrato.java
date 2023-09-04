package POOII.Exercicios.sorteador;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public abstract class SorteadorAbstrato<T> implements Sorteador<T> {

    private final List<T> elementos;

    public SorteadorAbstrato(List<T> elementos) {
        this.elementos = elementos;
    }

    /**
     * Sorteia e remove um elemento da lista
     * @return
     */
    public T sortear() {
        if (elementos.isEmpty()) {
            return null;
        }

        int indiceSorteado = getIndiceSorteado();
        return elementos.remove(indiceSorteado);

    }

    protected abstract int getIndiceSorteado();


    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }

    protected int quantidadeElementos() {
        return elementos.size();
    }

}