package ro.ase.cts.flyweight.clase;

public class Rezervare {
    private int numarMasa;
    private int nrPersoane;
    private String oraRezervare;

    public Rezervare(int numarMasa, int nrPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
