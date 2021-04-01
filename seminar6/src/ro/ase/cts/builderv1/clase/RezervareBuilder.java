package ro.ase.cts.builderv1.clase;

public class RezervareBuilder implements AbstractBuilder {

    private Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(false, false, false, false, "rock", 0);
    }


    public RezervareBuilder setAreMancareInclusa(boolean mancareInclusa) {
        this.rezervare.setAreMancareInclusa(mancareInclusa);
        return this;
    }
    public RezervareBuilder setAreScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(scaunErgonomic);
        return this;
    }
    public RezervareBuilder setAreBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.rezervare.setAreBauturaRacoritoare(bauturaRacoritoare);
        return this;
    }
    public RezervareBuilder setAreMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setAreMuzicaAmbientala(muzicaAmbientala);
        return this;
    }
    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }
    public RezervareBuilder setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }
    @Override
    public Rezervare build() {
        return rezervare;
    }
}
