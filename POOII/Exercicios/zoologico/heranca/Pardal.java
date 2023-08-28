package POOII.Exercicios.zoologico.heranca;

public class Pardal extends Animal implements Aves {
    @Override
    public void voar() {
        System.out.println("Pardal está voando");
    }

    @Override
    public void bicar() {
        System.out.println("Pardal está bicando");
    }

    @Override
    public void alimentar() {
        System.out.println("Pardal está se alimentando");
    }

    @Override
    public void beberAgua() {
        System.out.println("Pardal está bebendo água");
    }

    @Override
    public void cacar() {
        System.out.println("Pardal está procurando sementes e insetos");
    }
}


