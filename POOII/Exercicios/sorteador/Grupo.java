package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private final List<String> elementosDoGrupo;
    private final int indice;

    public Grupo(int indice) {
        this.indice = indice;
        this.elementosDoGrupo = new ArrayList<>();
    }

    public void adicionarNoGrupo(String novo) {
        elementosDoGrupo.add(novo);
    }

    @Override
    public String toString() {
        return "Grupo " + indice +
                "{ elementosDoGrupo=" + elementosDoGrupo +
                '}';
    }
}
