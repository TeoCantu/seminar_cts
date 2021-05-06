package ro.ase.cts.command.clase;

public abstract class Comanda {
    protected ContBancar contBancar;
    protected float suma;

    public Comanda(ContBancar contBancar, float suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    public abstract void executa();

}
