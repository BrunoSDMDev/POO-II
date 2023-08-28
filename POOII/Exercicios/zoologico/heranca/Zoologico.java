package POOII.Exercicios.zoologico.heranca;
public class Zoologico {
    public static void main(String[] args) {
        Vaca vaquinha = new Vaca();
        Tilapia peixinho = new Tilapia();
        Morcego morceguinho = new Morcego();
        vaquinha.alimentar();
        peixinho.alimentar();
        morceguinho.voar();
        vaquinha.beberAgua();
        vaquinha.cacar();
    }
}
