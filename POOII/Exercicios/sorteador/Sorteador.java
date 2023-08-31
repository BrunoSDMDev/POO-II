package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteador {
    private List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        Collections.shuffle(elementos);
        String sorteado = elementos.get(0);
        elementos.remove(0);
        return sorteado;
    }

    public List<Grupo> agrupar(int numeroDeGrupos) {
        List<Grupo> grupos = new ArrayList<>();
        int elementosPorGrupo = elementos.size() / numeroDeGrupos;
        int index = 0;
        for (int i = 0; i < numeroDeGrupos; i++) {
            List<String> grupo = new ArrayList<>();
            for (int j = 0; j < elementosPorGrupo; j++) {
                grupo.add(elementos.get(index++));
            }
            grupos.add(new Grupo(i, grupo));
        }
        return grupos;
    }



}
