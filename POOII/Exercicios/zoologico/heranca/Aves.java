package POOII.Exercicios.zoologico.heranca;

public abstract class Aves extends Animal {
    public abstract void voar();

    @Override
    public void alimentar() {
        System.out.println("está se alimentando");
    }

    @Override
    public void beberAgua() {
        System.out.println("está bebendo água");
    }

    @Override
    public void cacar() {
        System.out.println("está caçando");
    }

    public abstract void bicar();


}
