package ro.ase.cts.main;

import org.omg.Messaging.SyncScopeHelper;
import ro.ase.cts.clase.Cartita;
import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Program {

    public static void main(String[] args){
        DepartamentFinanciarEager departamentFinanciarEager1 = DepartamentFinanciarEager.getInstance();
        DepartamentFinanciarEager departamentFinanciarEager2 = DepartamentFinanciarEager.getInstance();

        System.out.println(departamentFinanciarEager1.toString());
        System.out.println(departamentFinanciarEager2.toString());

        departamentFinanciarEager1.setDirector("Ionescu");
        departamentFinanciarEager2.setNrAngajai(20);

        System.out.println(departamentFinanciarEager1.toString());
        System.out.println(departamentFinanciarEager2.toString());

        DepartamentFinanciar departamentFinanciar1 = DepartamentFinanciar.getInstance(10, "Dorel", 3000);
        DepartamentFinanciar departamentFinanciar2 = DepartamentFinanciar.getInstance(20, "Gigel", 4000);

        System.out.println(departamentFinanciar1.toString());
        System.out.println(departamentFinanciar2.toString());

        Cartita cartita1 = Cartita.getInstance(2, 5.3, "Cici");
        Cartita cartita2 = Cartita.getInstance(3, 2.5, "Fifi");

        System.out.println(cartita1.toString());
        System.out.println(cartita2.toString());

        cartita1.setVarsta(5);
        cartita2.setGreutate(7.9);

        System.out.println(cartita1.toString());
        System.out.println(cartita2.toString());

    }
}
