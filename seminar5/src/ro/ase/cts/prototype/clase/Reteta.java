package ro.ase.cts.prototype.clase;

public class Reteta implements RetetaMedicament{

    private String solutie;
    private int cantitate;

    public Reteta() {
    }

    public Reteta(String solutie, int cantitate) {
        this.solutie = solutie;
        this.cantitate = cantitate;
    }

    public String getSolutie() {
        return solutie;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setSolutie(String solutie) {
        this.solutie = solutie;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("solutie='").append(solutie).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public RetetaMedicament copiaza() {
        Reteta reteta = new Reteta();
        reteta.solutie = this.solutie;
        reteta.cantitate = this.cantitate;
        return reteta;
    }
}
