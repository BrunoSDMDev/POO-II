package POOII.Exercicios.projetos.persistance;

import POOII.Exercicios.projetos.model.Ator;

public interface Repository <T, ID> {

    T salvar (T entidade);
    boolean remover(T entidade);
    public void listarTodos();
    public void buscarPorId();

}
