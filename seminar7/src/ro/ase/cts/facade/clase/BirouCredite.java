package ro.ase.cts.facade.clase;

public class BirouCredite {
    public static boolean areCreante (Persoana persoana) {
        if(Integer.parseInt(""+persoana.getCnp().charAt(11))%2 == 0)
            return true;
        else return false;
    }
}
