package POOII.Exercicios.projetos.service;

import POOII.Exercicios.projetos.exception.DadoInvalidoException;
import POOII.Exercicios.projetos.exception.RegistroDuplicadoException;
import POOII.Exercicios.projetos.exception.RegistroNaoEncontradoException;
import POOII.Exercicios.projetos.model.Ator;
import POOII.Exercicios.projetos.persistance.AtorRepository;

import java.util.List;

public class AtorService {

    private final AtorRepository atorRepository;

    public AtorService(AtorRepository atorRepository) {
        this.atorRepository = atorRepository;
    }

    public Ator cadastrarAtor(String cpf, String nome) {
        if (existeAtor(cpf)) {
            throw new RegistroDuplicadoException("cpf");
        }

        if (cpf == null || nome == null) {
            throw new DadoInvalidoException("Campos cpf e nome não podem ser nulos");
        }

        return atorRepository.salvar(new Ator(cpf, nome));
    }

    public Ator atualizarAtor(String cpf, String nome) {
        if (!existeAtor(cpf)) {
            throw new RegistroNaoEncontradoException("cpf");
        }

        if (cpf == null) {
            throw new DadoInvalidoException("Campo cpf não podem ser nulo");
        }

        Ator atorAtualizado = new Ator(cpf, nome);
        return atorRepository.salvar(atorAtualizado);
    }

    public List<Ator> listarTodos() {
        return atorRepository.listarTodos();
    }

    public Ator buscarPorId(String cpf) {
        if (cpf == null) {
            throw new DadoInvalidoException("Campo cpf não podem ser nulo");
        }
        return atorRepository.buscarPorId(cpf);
    }

    public boolean remover(String cpf) {
        return atorRepository.removerPorId(cpf);
    }


    private boolean existeAtor(String cpf) {
        Ator atorEncontrado = buscarPorId(cpf);
        return atorEncontrado != null;
    }
}
