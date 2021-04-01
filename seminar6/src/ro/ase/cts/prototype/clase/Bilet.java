package ro.ase.cts.prototype.clase;

public class Bilet implements AbstractPrototype {
    private int codBilet;
    private String echipaA;
    private String echipaB;
    private String data;
    private String loc;

    public Bilet(int codBilet, String echipaA, String echipaB, String data, String loc) {
        //validari pentru data daca e meci, echipaA diferita de echipaB, echipaA joaca cu echipaB, codBilet unic
        this.codBilet = codBilet;
        this.echipaA = echipaA;
        this.echipaB = echipaB;
        this.data = data;
        this.loc = loc;
    }

    private Bilet() {}

    public void setCodBilet(int codBilet) {
        // verificare unicitate
        this.codBilet = codBilet;
    }

    public void setLoc(String loc) {
        // verificare unicitate
        this.loc = loc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("codBilet=").append(codBilet);
        sb.append(", echipaA='").append(echipaA).append('\'');
        sb.append(", echipaB='").append(echipaB).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", loc='").append(loc).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Bilet bilet = new Bilet();
        bilet.codBilet = this.codBilet;
        bilet.echipaA = this.echipaA;
        bilet.echipaB = this.echipaB;
        bilet.data = this.data;
        bilet.loc = this.loc;
        return bilet;
    }
}
