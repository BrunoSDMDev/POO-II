package POOII.Exercicios.projetos.persistance.memoria;


import POOII.Exercicios.projetos.model.Ator;
import POOII.Exercicios.projetos.persistance.AtorRepository;
public class AtorRepositoryEmMemoria extends RepositoryEmMemoriaAbstrato<Ator, String> implements AtorRepository {

    @Override
    public Ator buscarAutorPorNome(String nome) {
        for (Ator ator : listarTodos()) {
            if (ator.getNome().equals(nome)) {
                return ator;
            }
        }
        return null;
    }
}
