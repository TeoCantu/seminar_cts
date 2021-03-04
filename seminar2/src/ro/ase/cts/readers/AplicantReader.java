package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException;
}
