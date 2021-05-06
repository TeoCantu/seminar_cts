package ro.ase.cts.chain.clase;

public class ContEconomii extends Handler {
    public ContEconomii(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(super.getSold() >= suma) {
            System.out.printf("S-a realizat plata suma de "+suma+" din contul de economii");
            super.sold = super.sold - suma;
        } else {
            super.succesor.realizeazaPlata(suma);
        }
    }
}
