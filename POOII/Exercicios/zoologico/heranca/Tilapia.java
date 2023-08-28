package POOII.Exercicios.zoologico.heranca;

public class Tilapia extends Animal implements Aquatico{
    @Override
    public void alimentar() {
        System.out.println("Tilápia está se alimentando");
    }

    @Override
    public void beberAgua() {
        System.out.println("Tilápia está bebendo água");
    }

    @Override
    public void cacar() {
        System.out.println("Tilápia está procurando fitoplanctons");
    }

    @Override
    public void nadar() {
        System.out.println("Tilápia está nadando");
    }
}
