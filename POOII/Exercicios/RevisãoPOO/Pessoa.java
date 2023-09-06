package POOII.Exercicios.RevisãoPOO;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", idade=" + getIdade() + "anos" +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    @Override
    public int compareTo(Pessoa pessoaAComparar) {
        Integer idade = getIdade();
        int comparacaoDaIdade = idade.compareTo(pessoaAComparar.getIdade());
        boolean idadeSaoIguais = comparacaoDaIdade == 0;
        if (idadeSaoIguais){
            return nome.compareTo(pessoaAComparar.getNome());

        }
        return comparacaoDaIdade;

    }
}

