package ro.ase.cts.prototype.clase;

public class Client implements AbstractPrototype {
    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        // de realizat validari costisitoare
        this.nume = nume;
        this.varsta = varsta;
    }

    private Client() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Client client = new Client();
        client.nume = this.nume;
        client.varsta = this.varsta;
        return client;
    }
}
