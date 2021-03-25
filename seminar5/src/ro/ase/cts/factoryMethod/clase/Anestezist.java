package ro.ase.cts.factoryMethod.clase;

public class Anestezist extends PersonalSpital {
    public Anestezist(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Anestezist {" +
                " nume= " + getNume() +
                " salariu= " + getSalariu() +
                '}';
    }
}
