package ro.ase.cts.adapterClase.clase;

public class LeasingAdapterClase extends Leasing implements Creditable {

    public LeasingAdapterClase(String numeClient) {
        super(numeClient);
    }

    @Override
    public void oferaCredit() {
        super.oferaLeasing();
    }
}
