package ro.ase.cts.strategy.clase;

public class Cash implements ModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("S-a platit numerar suma de "+suma);
    }
}
