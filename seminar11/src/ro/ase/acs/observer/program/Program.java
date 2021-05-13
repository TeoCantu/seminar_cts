package ro.ase.acs.observer.program;

import ro.ase.acs.observer.clase.ClientFidel;
import ro.ase.acs.observer.clase.ManagerSala;

public class Program {
    public static void main(String[] args){
        ClientFidel client1 = new ClientFidel("Ion");
        ClientFidel client2 = new ClientFidel("Vasile");
        ClientFidel client3 = new ClientFidel("Gigel");
        ClientFidel client4 = new ClientFidel("Viorica");

        ManagerSala managerSala = new ManagerSala();

        managerSala.adaugaAbonat(client1);
        managerSala.adaugaAbonat(client2);
        managerSala.adaugaAbonat(client3);
        managerSala.adaugaAbonat(client4);

        managerSala.anuntaMeci("fotbal");

        managerSala.stergeAbonat(client2);

        managerSala.anuntaMeci("handbal");
    }
}
