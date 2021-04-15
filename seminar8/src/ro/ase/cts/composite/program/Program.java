package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {
    public static void main(String[] args) {
        Sectiune sectiuneBauturi = new Sectiune("Bauturi");
        Sectiune sectiuneDesert = new Sectiune("Desert");

        Item itemFrappe = new Item("Frappe");
        Item itemCafea = new Item("Cafea");
        Item itemBriosa = new Item("Briosa");

        sectiuneBauturi.addComponenta(itemCafea);
        sectiuneBauturi.addComponenta(itemFrappe);

        sectiuneDesert.addComponenta(itemBriosa);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.addComponenta(sectiuneBauturi);
        meniu.addComponenta(sectiuneDesert);
        meniu.afiseazaDescriere();


    }
}
