package ro.ase.cts.facade.clase;

public class Facade {


    public static boolean estePregatita(Masa masa){
        GestionarMese gestionarMese = new GestionarMese();
        Picolo picolo = new Picolo();
        if(gestionarMese.esteLibera(masa.getCod()))
        {
            if(picolo.esteDebarasata(masa.getCod())) {
                if (picolo.areServetele(masa.getCod())) {
                    return true;
                }
            }
        }
       return false;
    }


}
