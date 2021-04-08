package ro.ase.cts.adapterObiecte.program;

import ro.ase.cts.adapterObiecte.clase.Creditable;
import ro.ase.cts.adapterObiecte.clase.Leasing;
import ro.ase.cts.adapterObiecte.clase.LeasingAdapter;

public class Program {

    public static void afiseazaInformatiiCredit(Creditable credit) {
        credit.oferaCredit();
    }
    public static void main(String[] args) {
        Leasing leasing = new Leasing("Gigel");

        LeasingAdapter leasingAdapter = new LeasingAdapter(leasing);
        afiseazaInformatiiCredit(leasingAdapter);
    }
}
