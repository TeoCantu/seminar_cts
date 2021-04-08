package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract{
    private String detinator;

    public Card(String detinator) {
        this.detinator = detinator;
    }

    @Override
    public String getDetinator() {
        return detinator;
    }

    @Override
    public void realizeazaPlataOnline() {
        System.out.println(detinator+" realizeaza plata online");
    }

    @Override
    public void realizeazaPlataNormala() {
        System.out.println(detinator+" realizeaza plata normala");
    }

}
