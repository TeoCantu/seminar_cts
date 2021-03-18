package ro.ase.cts.clase;

public class Cartita {
    private int varsta;
    private double greutate;
    private String nume;

    private static Cartita cartita = null;

   private Cartita(int varsta, double greutate, String nume) {
        this.varsta = varsta;
        this.greutate = greutate;
        this.nume = nume;
    }

    public static synchronized Cartita getInstance(int varsta, double greutate, String nume) {
       if(cartita == null) {
           cartita = new Cartita(varsta, greutate, nume);
       }
       return cartita;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cartita{");
        sb.append("varsta=").append(varsta);
        sb.append(", greutate=").append(greutate);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
