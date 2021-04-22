package ro.ase.cts.state.clase;

public class Masa {
    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        stare = new StareLibera();
    }

    public void rezervaMasa(){
        if(this.stare instanceof StareLibera){
            this.stare = new StareRezervata();
            System.out.println("ati rezervat masa cu numarul "+this.nrMasa);
        } else {
            System.out.println("Masa cu numarul "+this.nrMasa+" nu poate fi rezervata");
        }
    }

    public void ocupaMasa(){
        if(this.stare instanceof StareRezervata || this.stare instanceof StareLibera) {
            this.stare = new StareOcupata();
            System.out.println("Ati ocupat masa cu numarul "+this.nrMasa);
        } else {
            System.out.println("Masa "+this.nrMasa+" nu poate fi ocupata");
        }
    }

    public void elibereazaMasa(){
        if(!(this.stare instanceof StareLibera)) {
            this.stare = new StareLibera();
            System.out.println("Masa "+this.nrMasa+" a fost eliberata");
        }
        else{
            System.out.println("Masa "+this.nrMasa+" este deja libera");
        }
    }


}
