package POOII.Exercicios;

import java.time.LocalDate;
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }

    // Fazer a classe Pessoa ser ordenada pelos nomes das pessoas

    @Override
    public int compareTo(Pessoa pessoaAComparar) {
        return this.nome.compareToIgnoreCase(pessoaAComparar.getNome());
    }

}

