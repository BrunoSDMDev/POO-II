package POOII.Exercicios.projetos.exception;

public class RegistroNaoEncontradoException extends RuntimeException {

    public RegistroNaoEncontradoException(String campo) {
        super("Não existe um registro cadastrado com este " + campo);
    }
}
