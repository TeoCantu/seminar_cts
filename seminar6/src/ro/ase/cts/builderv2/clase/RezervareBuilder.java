package ro.ase.cts.builderv2.clase;

public class RezervareBuilder implements AbstractBuilder {
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoare;
    private boolean areMuzicaAmbientala;
    private String genMuzica;
    private int codRezervare;

    public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
        this.areBauturaRacoritoare = areBauturaRacoritoare;
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public RezervareBuilder setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(areMancareInclusa, areScaunErgonomic, areBauturaRacoritoare, areMuzicaAmbientala, genMuzica, codRezervare);
    }
}
