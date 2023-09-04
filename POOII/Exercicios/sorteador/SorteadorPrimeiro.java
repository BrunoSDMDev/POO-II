package POOII.Exercicios.sorteador;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public class SorteadorPrimeiro<T> extends SorteadorAbstrato<T> {

    public SorteadorPrimeiro(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return 0;
    }


}