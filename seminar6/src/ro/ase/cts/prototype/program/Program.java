package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.Client;

public class Program {
    public static void main(String[] args) {
        Client client1 = new Client("Ion", 19);
        Client client2 = (Client) client1.copiaza();
        System.out.println(client1.toString());
        System.out.println(client2.toString());

        Bilet bilet1 = new Bilet(0, "Arsenal", "Barcelona", "01-04-2021", "0");
        Bilet bilet2 = new Bilet(0, "Liverpool", "Manchester", "02-04-2021", "0");

        Bilet bilet3 = (Bilet) bilet1.copiaza();
        bilet3.setCodBilet(1);
        bilet3.setLoc("1A");

        Bilet bilet4 = (Bilet) bilet1.copiaza();
        bilet4.setCodBilet(2);
        bilet4.setLoc("2A");

        System.out.println(bilet3.toString());
        System.out.println(bilet4.toString());
    }
}
