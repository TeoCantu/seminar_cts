package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract{
    private CardAbstract cardAbstract;

    public DecoratorAbstract(CardAbstract cardAbstract) {
        this.cardAbstract = cardAbstract;
    }
    @Override
    public String getDetinator() {
        return this.cardAbstract.getDetinator();
    }

    @Override
    public void realizeazaPlataOnline() {
        this.cardAbstract.realizeazaPlataOnline();
    }

    @Override
    public void realizeazaPlataNormala() {
        this.cardAbstract.realizeazaPlataNormala();
    }

    public abstract void realizeazaPlataContactless();
}
