package POOII.Exercicios.projetos.persistance;

import POOII.Exercicios.projetos.model.Ator;
import POOII.Exercicios.projetos.model.Entidade;

import java.util.List;

public interface Repository<T extends Entidade<ID>, ID> {

    T salvar(T entidade);

    boolean remover(T entidade);

    boolean removerPorId(ID identificador);

    List<T> listarTodos();

    T buscarPorId(ID identificador);
}
