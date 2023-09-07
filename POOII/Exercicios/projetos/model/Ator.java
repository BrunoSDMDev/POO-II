package POOII.Exercicios.projetos.model;

public class Ator implements Entidade<String> {

    private final String cpf;

    private final String nome;

    public Ator(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String getId() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
