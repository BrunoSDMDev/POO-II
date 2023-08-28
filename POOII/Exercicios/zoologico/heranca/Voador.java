package POOII.Exercicios.zoologico.heranca;

public interface Voador {
    default void voar(){
        System.out.println("Tá voando");
    }
}
