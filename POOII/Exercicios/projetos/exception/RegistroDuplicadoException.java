package POOII.Exercicios.projetos.exception;

public class RegistroDuplicadoException extends RuntimeException {

    public RegistroDuplicadoException(String campo) {
        super("Já existe um registro cadastrado com este " + campo);
    }
}
