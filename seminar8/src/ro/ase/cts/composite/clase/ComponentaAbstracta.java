package ro.ase.cts.composite.clase;

public interface ComponentaAbstracta {
    void addComponenta(ComponentaAbstracta componentaAbstracta) throws Exception;
    void stergeComponenta(ComponentaAbstracta componentaAbstracta);
    ComponentaAbstracta getComponenta(int pozitie);
    void afiseazaDescriere();
}
