package ro.ase.cts.facade.clase;

public class Facade {
    public static boolean esteEligibil (Persoana persoana) {
        if(persoana.getVarsta()>18) {
            if(!Politie.esteUrmarit(persoana)) {
                if(!BirouCredite.areCreante(persoana)) {
                    return true;
                }else return false;
            }else return false;
        }else return false;
    }
}
