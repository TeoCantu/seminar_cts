package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.*;

public class Program {
    public static void main(String[] args) {
        Handler contCurent = new ContCurent(4000);
        Handler contCredit = new ContCredit(1000);
        Handler contEconomii = new ContEconomii(10000);
        Handler contIndisponibil = new RefuzaTranzactia();

        contCurent.setSuccesor(contEconomii);
        contEconomii.setSuccesor(contCredit);
        contCredit.setSuccesor(contIndisponibil);

        contCurent.realizeazaPlata(5000);
    }
}
