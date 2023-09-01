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
        List<Grupo> grupos = inicializarGrupos(numeroDeGrupos);
        System.out.println(grupos);

        int indiceDoGrupoAtual = 0;
        while (possuiElementos()){
            String elementorSorteado = sortear();
            Grupo grupoAtual = grupos.get(indiceDoGrupoAtual);
            grupoAtual.adicionarNoGrupo(elementorSorteado);
            indiceDoGrupoAtual++;
            if (indiceDoGrupoAtual == numeroDeGrupos){
                indiceDoGrupoAtual = 0;
            }
        }

        return grupos;
    }


    private boolean possuiElementos () {
        return !elementos.isEmpty();
    }


    public static List<Grupo> inicializarGrupos (int numeroDeGrupos){
        List<Grupo> grupos = new ArrayList<>();

        for (int i = 0; i < numeroDeGrupos; i++){
            grupos.add(new Grupo(i));
        }
        return grupos;
    }



}
