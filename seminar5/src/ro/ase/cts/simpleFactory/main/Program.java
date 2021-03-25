package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Program {
    public static void main(String[] args){



        try {
            // cand am createPersonalSpital ca metoda
            // FactoryPersonal factoryPersonal = new FactoryPersonal(); // cand am ca metoda
//            PersonalSpital brancardier = factoryPersonal.createPersonalSpital(TipPersonal.Brancardier, "Ion", 1200);
//            PersonalSpital medic = factoryPersonal.createPersonalSpital(TipPersonal.Medic, "Dorel", 50000);

            //cand am functie statica
            PersonalSpital brancardier = FactoryPersonal.createPersonalSpital(TipPersonal.Brancardier, "Ion", 1200);
            PersonalSpital medic = FactoryPersonal.createPersonalSpital(TipPersonal.Medic, "Dorel", 5000);

            System.out.println(brancardier.toString());
            System.out.println(medic.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
