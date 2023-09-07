package POOII.Exercicios.projetos.persistance.memoria;

import POOII.Exercicios.projetos.model.Ator;
import POOII.Exercicios.projetos.model.Entidade;
import POOII.Exercicios.projetos.persistance.Repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class RepositoryEmMemoriaAbstrato<E extends Entidade<ID>, ID> implements Repository<E, ID> {

    private final Map<ID, E> dados = new HashMap<>();

    @Override
    public E salvar(E entidade) {
        E atorJaCadastrado = buscarPorId(entidade.getId());
        if (atorJaCadastrado != null) {
            remover(atorJaCadastrado);
        }
        dados.put(entidade.getId(), entidade);
        return entidade;
    }

    @Override
    public boolean remover(E entidade) {
        return removerPorId(entidade.getId());
    }

    @Override
    public boolean removerPorId(ID identificador) {
        E atorRemovido = dados.remove(identificador);
        return atorRemovido != null;
    }

    @Override
    public List<E> listarTodos() {
        return new ArrayList<>(dados.values());
    }

    @Override
    public E buscarPorId(ID identificador) {
        return dados.get(identificador);
    }
}