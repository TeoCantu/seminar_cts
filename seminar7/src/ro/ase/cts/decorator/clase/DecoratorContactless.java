package ro.ase.cts.decorator.clase;

public class DecoratorContactless extends DecoratorAbstract {
    public DecoratorContactless(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void realizeazaPlataContactless() {
        System.out.println(super.getDetinator() +" realizeaza plata contactless");
    }
}