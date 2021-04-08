package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.CardAbstract;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;

public class Program {
    public static void main(String[] args) {
        CardAbstract card = new Card("Gigel");

        card.realizeazaPlataNormala();
        card.realizeazaPlataOnline();

        DecoratorAbstract decorator = new DecoratorContactless(card);
        decorator.realizeazaPlataContactless();
        decorator.realizeazaPlataNormala();
        decorator.realizeazaPlataOnline();
    }
}
