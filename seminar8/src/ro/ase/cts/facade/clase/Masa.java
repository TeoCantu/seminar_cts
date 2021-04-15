package ro.ase.cts.facade.clase;

public class Masa {
    private int cod;
    private int nrMaxPersoane;

    public Masa(int cod, int nrMaxPersoane) {
        this.cod = cod;
        this.nrMaxPersoane = nrMaxPersoane;
    }

    public int getCod() {
        return cod;
    }

    public int getNrMaxPersoane() {
        return nrMaxPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("cod=").append(cod);
        sb.append(", nrMaxPersoane=").append(nrMaxPersoane);
        sb.append('}');
        return sb.toString();
    }
}
