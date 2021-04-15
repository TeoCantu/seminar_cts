package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.GestionarMese;
import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.Picolo;

import javax.xml.bind.Marshaller;

public class Program {
    public static void main(String[] args) {
//        GestionarMese gestionarMese = new GestionarMese();
//        Picolo picolo = new Picolo();
//        Masa masa = new Masa(12, 4);
//
//        if(gestionarMese.esteLibera(masa.getCod()))
//        {
//            if(picolo.esteDebarasata(masa.getCod())) {
//                if (picolo.areServetele(masa.getCod())) {
//                    System.out.println("Masa " + masa.getCod() + " poate fi ocupata");
//                }
//                else System.out.printf("Asteptati");
//            }
//            else System.out.printf("Asteptati");
//        }
//        else System.out.printf("Asteptati");
        Masa masa = new Masa(12, 4);
        if(Facade.estePregatita(masa)){
            System.out.println("Masa " + masa.getCod() + " poate fi ocupata");
        }
        else {
            System.out.printf("Asteptati");
        }

    }
}
