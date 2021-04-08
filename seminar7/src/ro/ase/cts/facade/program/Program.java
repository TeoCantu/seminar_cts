package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BirouCredite;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Program {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Maricica", "2990914077777");
        if(persoana.getVarsta()>18) {
            if(!Politie.esteUrmarit(persoana)) {
                if(!BirouCredite.areCreante(persoana)) {
                    System.out.println(persoana.getNume() + " este eligibil pentru creare cont");
                }
            }
        }

        Persoana persoana2 = new Persoana("Gigel", "1990914077777");
        if(Facade.esteEligibil(persoana2)) {
            System.out.println(persoana2.getNume()+" este eligibil");
        } else System.out.println(persoana2.getNume() + " nu este eligibili");
    }
}
