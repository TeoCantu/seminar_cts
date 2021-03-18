package ro.ase.cts.clase;

public class DepartamentFinanciar {
    private int nrAngajai;
    private String director;
    private double salariulDeBaza;

    private static DepartamentFinanciar departamentFinanciar = null;

    private DepartamentFinanciar(int nrAngajai, String director, double salariulDeBaza) {
        this.nrAngajai = nrAngajai;
        this.director = director;
        this.salariulDeBaza = salariulDeBaza;
    }

    public static synchronized DepartamentFinanciar getInstance(int nrAngajati, String director, double salariu) {
        if(departamentFinanciar == null) {
            departamentFinanciar = new DepartamentFinanciar(nrAngajati, director, salariu);
        }
        return departamentFinanciar;
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
        final StringBuilder sb = new StringBuilder("DepartamentFinanciar{");
        sb.append("nrAngajai=").append(nrAngajai);
        sb.append(", director='").append(director).append('\'');
        sb.append(", salariulDeBaza=").append(salariulDeBaza);
        sb.append('}');
        return sb.toString();
    }
}
