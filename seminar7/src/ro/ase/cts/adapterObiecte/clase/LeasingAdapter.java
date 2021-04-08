package ro.ase.cts.adapterObiecte.clase;

public class LeasingAdapter implements Creditable {
    private Leasing leasing;

    public LeasingAdapter(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit() {
        this.leasing.oferaLeasing();
    }
}
