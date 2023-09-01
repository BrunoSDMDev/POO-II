package POOII.Exercicios.sorteador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteador <T>{
    private List<T> elementos;

    public Sorteador(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        if (elementos.isEmpty()) {
            return null;
        }
        int indiceSorteado = ThreadLocalRandom.current().nextInt(elementos.size());
        T sorteado = elementos.remove(indiceSorteado);
        return sorteado;
    }

    public List<Grupo<T>> agrupar(int numeroDeGrupos) {
        List<Grupo <T>> grupos = inicializarGrupos(numeroDeGrupos);
        System.out.println(grupos);

        int indiceDoGrupoAtual = 0;
        while (possuiElementos()){
            T elementorSorteado = sortear();
            Grupo <T> grupoAtual = grupos.get(indiceDoGrupoAtual);
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


    public List<Grupo <T>> inicializarGrupos (int numeroDeGrupos){
        List<Grupo <T>> grupos = new ArrayList<>();

        for (int i = 0; i < numeroDeGrupos; i++){
            grupos.add(new Grupo(i));
        }
        return grupos;
    }



}
