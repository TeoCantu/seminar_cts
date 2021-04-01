package ro.ase.cts.builderv1.program;

import ro.ase.cts.builderv1.clase.Rezervare;
import ro.ase.cts.builderv1.clase.RezervareBuilder;

public class Program {

    public static void main(String[] args) {

        Rezervare rezervare1 = new RezervareBuilder().setCodRezervare(1).setAreBauturaRacoritoare(true).build();
        Rezervare rezervare2 = new RezervareBuilder().setAreMancareInclusa(true).setAreMuzicaAmbientala(true).setCodRezervare(2).build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);

        RezervareBuilder rezervareBuilder = new RezervareBuilder().setAreBauturaRacoritoare(true);
        Rezervare rezervare3 = rezervareBuilder.build();
        Rezervare rezervare4 = rezervareBuilder.setCodRezervare(123).build();
        // rezervare3 si rezervare4 vor avea acelasi cod 123, se face shallow copy, returnam aceasi instanta de fiecare data
    }
}
