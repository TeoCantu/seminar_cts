package ro.ase.cts.proxy.clase;

public class OperatorRezervari implements IOperatorRezervare {

    @Override
    public void realizeazaRezervare(int nrPersoane) {
        System.out.println("A fost realizata rezervarea pentru "+nrPersoane+" persone");
    }
}
