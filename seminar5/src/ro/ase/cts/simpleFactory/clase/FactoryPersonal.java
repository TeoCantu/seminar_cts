package ro.ase.cts.simpleFactory.clase;

public class FactoryPersonal {
    public static PersonalSpital createPersonalSpital(TipPersonal tipPersonal, String nume, int salariu) throws Exception {
        switch (tipPersonal) {
            case Brancardier:
                return new Brancardier(nume, salariu);
            case Medic:
                return new Medic(nume, salariu);
            case Asistent:
                return new Asistent(nume, salariu);
            default:
                throw new Exception("Tip incorect");
        }
    }
}
