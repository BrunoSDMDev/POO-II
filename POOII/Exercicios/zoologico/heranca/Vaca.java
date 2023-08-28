package POOII.Exercicios.zoologico.heranca;

public class Vaca extends Animal implements Mamifero{
    @Override
    public void alimentar() {
        System.out.println("Vaca está se alimentando");
    }

    @Override
    public void beberAgua() {
        System.out.println("Vaca está bebendo água");
    }

    @Override
    public void cacar() {
        System.out.println("Vaca está procurando folhas");
    }

    @Override
    public void amamentar() {
        System.out.println("Vaca está amamentando");
    }
}
