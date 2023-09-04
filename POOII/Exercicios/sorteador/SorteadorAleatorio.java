package POOII.Exercicios.sorteador;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public class SorteadorAleatorio<T> extends SorteadorAbstrato<T> {


    public SorteadorAleatorio(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return ThreadLocalRandom.current().nextInt(0, quantidadeElementos());
    }


}