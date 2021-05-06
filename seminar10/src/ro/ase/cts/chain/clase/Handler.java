package ro.ase.cts.chain.clase;

public abstract class Handler {
    protected Handler succesor;
    protected float sold;

    public Handler(float sold) {
        this.succesor = null;
        this.sold = sold;
    }

    public Handler getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public abstract void realizeazaPlata(float suma);
}
