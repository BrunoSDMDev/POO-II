package POOII.Exercicios.sorteador;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class SorteadorUltimo<T> extends SorteadorAbstrato<T> {


    public SorteadorUltimo(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return quantidadeElementos() - 1;
    }

}