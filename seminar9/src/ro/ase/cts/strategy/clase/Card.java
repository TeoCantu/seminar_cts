package ro.ase.cts.strategy.clase;

public class Card implements ModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("a fost realizata plata cu cardul pentru suma de "+suma);
    }
}
