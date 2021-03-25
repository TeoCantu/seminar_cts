package ro.ase.cts.factoryMethod.clase;

public class Medic extends PersonalSpital {
    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Medic{" +
                " nume= " + getNume() +
                " salariu= " + getSalariu() +
                '}';
    }
}
