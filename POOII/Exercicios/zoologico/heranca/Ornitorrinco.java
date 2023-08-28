package POOII.Exercicios.zoologico.heranca;

public class Ornitorrinco extends Animal implements Mamifero, Aquatico, Aves{

    @Override
    public void alimentar() {
        System.out.println("Ornitorrinco está se alimentando");
    }

    @Override
    public void beberAgua() {
        System.out.println("Ornitorrinco está bebendo água");
    }

    @Override
    public void cacar() {
        System.out.println("Ornitorrinco está caçando");
    }

    @Override
    public void nadar() {
        System.out.println("Ornitorrinco está nadando");
    }

    @Override
    public void voar() {
        System.out.println("Ornitorrinco está tentando voar");
    }

    @Override
    public void bicar() {
        System.out.println("Ornitorrinco está bicando");
    }

    @Override
    public void amamentar() {
        System.out.println("Ornitorrinco está amamentando");
    }
}
