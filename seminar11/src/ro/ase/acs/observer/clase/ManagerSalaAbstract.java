package ro.ase.acs.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {

    private List<Observer> clientiFideli;

    public ManagerSalaAbstract() {
        this.clientiFideli = new ArrayList<>();
    }

    public void adaugaAbonat(Observer clientNou) {
        clientiFideli.add(clientNou);
    }

    public void stergeAbonat(Observer client) {
        clientiFideli.remove(client);
    }



    public void trimiteNotificare(String mesaj) {
        for(Observer observer : clientiFideli){
            observer.primesteMesaj(mesaj);
        }
    }
}
