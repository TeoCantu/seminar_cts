package ro.ase.cts.adapterClase.program;

import ro.ase.cts.adapterClase.clase.Creditable;
import ro.ase.cts.adapterClase.clase.LeasingAdapterClase;
import ro.ase.cts.adapterObiecte.clase.Leasing;
import ro.ase.cts.adapterObiecte.clase.LeasingAdapter;

public class Program {

    public static void afiseazaInformatiiCredit(Creditable credit) {
        credit.oferaCredit();
    }
    public static void main(String[] args) {
        LeasingAdapterClase leasingAdapter = new LeasingAdapterClase("Gigel");
        afiseazaInformatiiCredit(leasingAdapter);
    }
}
