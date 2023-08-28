package POOII.Exercicios.zoologico.heranca;

public class Golfinho extends Animal implements Mamifero, Aquatico{
    @Override
    public void alimentar() {
        System.out.println("Golfinho está se alimentando");
    }

    @Override
    public void beberAgua() {
        System.out.println("Golfinho está bebendo água");;
    }

    @Override
    public void cacar() {
        System.out.println("Golfinho está caçando");
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho está nadando");
    }

    @Override
    public void amamentar() {
        System.out.println("Golfinho está amamentando");
    }
}
