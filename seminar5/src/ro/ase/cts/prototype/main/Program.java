package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Reteta;
import ro.ase.cts.prototype.clase.RetetaMedicament;

public class Program {

    public static void main(String[] args) {
        Reteta reteta1 = new Reteta("Apa oxigenata", 10);
        RetetaMedicament reteta2 = reteta1.copiaza();

        System.out.println(reteta1);
        System.out.println(reteta2);
    }

}
