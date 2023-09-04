package POOII.Exercicios.sorteador;
import java.util.List;
public class SorteadorMedia<T> extends SorteadorAbstrato<T> {


    public SorteadorMedia(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return quantidadeElementos() / 2;
    }


}