package ro.ase.cts.strategy.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata= new Cash();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteNota(double suma) {
        System.out.println(this.nume+" are de platit nota");
        modPlata.plateste(suma);
    }
}
