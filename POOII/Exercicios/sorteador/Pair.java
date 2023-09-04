package POOII.Exercicios.sorteador;

public class Pair<T, S> {

    private final T primeiro;
    private final S segundo;

    public Pair(T primeiro, S segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public S getSegundo() {
        return segundo;
    }
}
