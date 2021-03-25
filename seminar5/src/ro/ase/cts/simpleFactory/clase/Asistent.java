package ro.ase.cts.simpleFactory.clase;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Asistent{" +
                " nume= " + getNume() +
                " salariu= " + getSalariu() +
                '}';
    }
}
