package POOII.Exercicios.projetos.model;

import java.util.List;

public class Filme implements Entidade<Integer> {

    private final Integer id;
    private final String nome;
    private final String categoria;
    private final List<Diretor> diretores;
    private final List<Ator> atores;

    public Filme(Integer id, String nome, String categoria, List<Diretor> diretores, List<Ator> atores) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.diretores = diretores;
        this.atores = atores;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", diretores=" + diretores +
                ", atores=" + atores +
                '}';
    }
}
