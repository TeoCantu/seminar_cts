package ro.ase.cts.simpleFactory.clase;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Brancardier{" +
                " nume= " + getNume() +
                " salariu= " + getSalariu() +
                '}';
    }
}
