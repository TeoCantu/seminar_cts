package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervari;
import ro.ase.cts.proxy.clase.ProxyOperatorRezervari;

public class Program {
    public static void main(String[] args) {
        OperatorRezervari operatorRezervari = new OperatorRezervari();
        operatorRezervari.realizeazaRezervare(3);

        ProxyOperatorRezervari proxyOperatorRezervari = new ProxyOperatorRezervari(operatorRezervari, 4);
        proxyOperatorRezervari.realizeazaRezervare(3);
    }
}
