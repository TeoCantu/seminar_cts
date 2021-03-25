package ro.ase.cts.factoryMethod.clase;

public class FactoryMedic implements FactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
