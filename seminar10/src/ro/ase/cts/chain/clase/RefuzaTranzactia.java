package ro.ase.cts.chain.clase;

public class RefuzaTranzactia extends Handler {
    public RefuzaTranzactia() {
        super(0);
    }

    @Override
    public void realizeazaPlata(float suma) {
        System.out.println("Fonduri insuficiente pentru a extrage suma de " + suma);
    }
}
