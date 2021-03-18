package ro.ase.cts.clase;

public class DepartamentFinanciarEager {
    private int nrAngajai;
    private String director;
    private double salariulDeBaza;

    private static DepartamentFinanciarEager departamentFinanciarEager =
            new DepartamentFinanciarEager(10, "Popescu", 2500);

    private DepartamentFinanciarEager(int nrAngajai, String director, double salariu) {
        this.nrAngajai = nrAngajai;
        this.director = director;
        this.salariulDeBaza = salariu;
    }

    public static DepartamentFinanciarEager getInstance(){
        return departamentFinanciarEager;
    }

    public void setNrAngajai(int nrAngajai) {
        this.nrAngajai = nrAngajai;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setSalariulDeBaza(double salariulDeBaza) {
        this.salariulDeBaza = salariulDeBaza;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DepartamentFinanciarEager{");
        sb.append("nrAngajai=").append(nrAngajai);
        sb.append(", director='").append(director).append('\'');
        sb.append(", salariulDeBaza=").append(salariulDeBaza);
        sb.append('}');
        return sb.toString();
    }
}
