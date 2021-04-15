package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta {
    private List<ComponentaAbstracta> optiuni;
    private String denumire;

    public Sectiune(String denumire) {
        this.optiuni = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void addComponenta(ComponentaAbstracta componentaAbstracta) {
        this.optiuni.add(componentaAbstracta);
    }

    @Override
    public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
        this.optiuni.remove(componentaAbstracta);
    }

    @Override
    public ComponentaAbstracta getComponenta(int pozitie) {
        if(pozitie>0 && pozitie<this.optiuni.size()){
            return this.optiuni.get(pozitie);
        }
        return null;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectiunea "+this.denumire);
        for(ComponentaAbstracta comp:this.optiuni){
            comp.afiseazaDescriere();
        }
    }
}
