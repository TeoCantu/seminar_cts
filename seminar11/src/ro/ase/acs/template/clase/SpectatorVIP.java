package ro.ase.acs.template.clase;

public class SpectatorVIP extends SpectatorAbstract {
    private String nume;

    public SpectatorVIP(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void asezareCoada() {
        System.out.println(nume+" se prezinta la poarta");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume+" prezinta biletul VIP");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(nume+" realizeaza controlul corporal");
    }

    @Override
    public void intraPeStadion() {
        System.out.println(nume+" intra in tribuna VIP");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(nume+" ocupa loc in loja");
    }
}
