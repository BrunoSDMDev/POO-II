package POOII.Exercicios.sorteador;


public interface Sorteador<T> {

    /**
     * Sorteia e remove um elemento da lista
     * @return
     */
    RecordPair<T, Integer> sortear() ;

    boolean possuiElementos();

}
