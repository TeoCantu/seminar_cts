package ro.ase.cts.adapterClase.clase;

public class Leasing {
    private String numeClient;

    public Leasing(String numeClient) {
        this.numeClient = numeClient;
    }

    public void oferaLeasing() {
        System.out.println("i se ofera un leasing lui "+numeClient);
    }

}
