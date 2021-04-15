package ro.ase.cts.proxy.clase;

public class ProxyOperatorRezervari implements IOperatorRezervare {

    private OperatorRezervari operatorRezervari;
    private int nrMinimPersoane;

    public ProxyOperatorRezervari(OperatorRezervari operatorRezervari, int nrMinimPersoane) {
        this.operatorRezervari = operatorRezervari;
        this.nrMinimPersoane = nrMinimPersoane;
    }

    @Override
    public void realizeazaRezervare(int nrPersoane) {
        if(nrPersoane>=this.nrMinimPersoane){
            this.operatorRezervari.realizeazaRezervare(nrPersoane);
        }
        else{
            System.out.println("Mergeti direct in restaurant");
        }
    }
}
