package POOII.Exercicios.projetos.persistance;

import POOII.Exercicios.projetos.model.Ator;
public interface AtorRepository extends Repository<Ator, String> {

    Ator buscarAutorPorNome(String nome);

}
