package POOII.Exercicios.projetos;

import POOII.Exercicios.projetos.model.Filme;
import POOII.Exercicios.projetos.model.Ator;
import POOII.Exercicios.projetos.model.Diretor;
import POOII.Exercicios.projetos.persistance.memoria.AtorRepositoryEmMemoria;
import POOII.Exercicios.projetos.persistance.memoria.FilmeRepositoryEmMemoria;
import POOII.Exercicios.projetos.persistance.memoria.DiretorRepositoryEmMemoria;
import POOII.Exercicios.projetos.service.AtorService;

import java.util.List;

public class SistemaDeFilmes {

    public static void main(String[] args) {
        AtorRepositoryEmMemoria atorRepository = new AtorRepositoryEmMemoria();
        AtorService atorService = new AtorService(atorRepository);
        atorService.cadastrarAtor("12345", "Jhon Travolta");
        atorService.cadastrarAtor("122", "Angelina Jolie");
        Ator morganFreeman = atorService.cadastrarAtor("999999", "Morgan Freeman");
        System.out.println(atorService.listarTodos());
        atorService.atualizarAtor("122", "Megan Fox");
        System.out.println(atorService.listarTodos());
        atorService.remover(morganFreeman.getId());
        System.out.println(atorService.listarTodos());
        System.out.println(atorService.buscarPorId("122"));
        System.out.println(atorService.remover("555"));
        atorService.cadastrarAtor(morganFreeman.getId(), morganFreeman.getNome());

        DiretorRepositoryEmMemoria diretorRepository = new DiretorRepositoryEmMemoria();
        Diretor martinScorcese = new Diretor(1, "Martin Scorcese");
        diretorRepository.salvar(martinScorcese);
        Diretor quentinTarantino = new Diretor(2, "Quentin Tarantino");
        diretorRepository.salvar(quentinTarantino);
        System.out.println(diretorRepository.listarTodos());

        FilmeRepositoryEmMemoria filmeRepository = new FilmeRepositoryEmMemoria();
        filmeRepository.salvar(new Filme(1, "Fale comigo", "Drama", List.of(martinScorcese), null));
        filmeRepository.salvar(new Filme(2, "Kill Bill Volume 1", "Ação", List.of(quentinTarantino), List.of(morganFreeman)));
        System.out.println(filmeRepository.listarTodos());
    }
}
