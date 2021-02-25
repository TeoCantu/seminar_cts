package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listaAnimale;
    private Zookeeper zookeeper;

    public Zoo(List<Animal> listaAnimale, Zookeeper zookeeper) {
        super();
        this.listaAnimale = listaAnimale;
        this.zookeeper = zookeeper;
    }

    public Zoo() {
        super();
        this.listaAnimale = new ArrayList<Animal>();
        this.zookeeper = new Zookeeper("Teo");

    }

    public void add (Animal animal){
        this.listaAnimale.add(animal);
    }

    public void feedAnimals(){
        for(Animal animal : listaAnimale){
            zookeeper.feed(animal);
        }
    }
}
