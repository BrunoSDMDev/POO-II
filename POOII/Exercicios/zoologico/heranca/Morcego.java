package POOII.Exercicios.zoologico.heranca;

public class Morcego extends Animal implements Voador, Mamifero{

    @Override
    public void alimentar() {
        System.out.println("Morcego está se alimentando");
    }

    @Override
    public void beberAgua() {
        System.out.println("Morcego está bebendo água");
    }

    @Override
    public void cacar() {
        System.out.println("Morcego está procurando frutinhas");
    }

    @Override
    public void voar() {
        System.out.println("Morcego está voando");
    }


    @Override
    public void amamentar() {
        System.out.println("Morcego está amamentando");
    }
}
