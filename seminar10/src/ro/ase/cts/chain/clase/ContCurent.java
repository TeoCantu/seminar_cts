package ro.ase.cts.chain.clase;

public class ContCurent extends Handler {
    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(super.getSold() >= suma) {
            System.out.printf("S-a realizat plata suma de "+suma+" din contul curent");
            super.sold = super.sold - suma;
        } else {
            super.succesor.realizeazaPlata(suma);
        }
    }
}
