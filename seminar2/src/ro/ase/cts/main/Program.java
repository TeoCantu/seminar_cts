package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static List<Aplicant> readAplicants(AplicantReader aplicantReader) throws FileNotFoundException, NumberFormatException {
		return aplicantReader.readAplicants();

	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
		    System.out.println("suma finantata angajat: " + Angajat.getSumaFinantata());
		    System.out.println("suma finantata student: " + Student.getSumaFinantata());

			listaAplicanti = readAplicants(new AngajatReader("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti){
                System.out.println(aplicant.toString());
                aplicant.afiseazaSumaFinantata();
            }

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
