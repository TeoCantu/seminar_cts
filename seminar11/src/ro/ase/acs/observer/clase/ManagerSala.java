package ro.ase.acs.observer.clase;

public class ManagerSala extends ManagerSalaAbstract {

    public void anuntaMeci(String tipMeci) {
        super.trimiteNotificare("Incepe meciul de "+tipMeci);
    }
}
