package ro.ase.cts.facade.clase;

import java.time.LocalDate;

public class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta() {
        int an=(1900 + Integer.parseInt("" + this.cnp.charAt(1) + this.cnp.charAt(2)));
        return LocalDate.now().getYear() - an;
    }
}
