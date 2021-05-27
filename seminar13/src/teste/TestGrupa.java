package teste;

import clase.Grupa;
import clase.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestGrupa {
    private Grupa grupa;

    @Before
    public void setup() {
        grupa = new Grupa(1077);
        for(int i=0; i<10; i++) {
            Student student = new Student("Marcel");
            student.adaugaNota(5);
            student.adaugaNota(10);
            student.adaugaNota(4);
            grupa.adaugaStudent(student);
        }
    }

    //right bicep pentru restante
    // right
    @Test
    public void testGetPromovabilitateRight() {
        for(int i=0; i<2; i++){
            Student student = new Student("Maria");
            student.adaugaNota(9);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.16, grupa.getPromovabilitate(), 0.05);
    }

    // boundary
    @Test
    public void testGetPromovabilitateLowerBoundary() {
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGetPromovabilitateUpperBoundary() {
        Grupa grupa = new Grupa(1076);
        for(int i=0; i<10; i++){
            Student student = new Student("Maria");
            student.adaugaNota(9);
            grupa.adaugaStudent(student);
        }

        assertEquals(1, grupa.getPromovabilitate(), 0.01);

    }

    // inverse relationship - nu se aplica
    // cross check - nu se aplica
    // error condition - pt situatia in care nu exista studenti in grupa
    @Test(expected = IllegalArgumentException.class)
    public void testGetPromovabilitateErrorCondition() {
        Grupa grupa = new Grupa(1068);
        grupa.getPromovabilitate();
    }

    //performance
    @Test(timeout = 500)
    public void testGetPromovabilitatePerformance() {
        grupa.getPromovabilitate();
    }

    // correct pentru getPromovabilitate
    // conformance - format returnat - testul de right
    // ordering - nu se aplica
    // range - intervalul de valori = right+ upperboundary+ lowerboundary
    // reference - referinta externa este Studentul cu apelul metodei areRestanta
    // existance - errorcondition (ca nu am studenti) + existenta rezultatului
    // cardinality - 0,1,n = 0(errorcondition)+n(mai multi) + de facut pentru un student
    // time - performance + daca e respectat un sablon (apel metode in ordinea corecta)

    // right bicep pentru constructor
    @Test
    public void testConstructorRight() {
        Grupa grupa = new Grupa(1077);
        assertEquals(1077, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara() {
        int nrGrupa = 1000;
        Grupa grupa = new Grupa(nrGrupa);
        assertEquals(nrGrupa, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara() {
        int nrGrupa = 1100;
        Grupa grupa = new Grupa(nrGrupa);
        assertEquals(nrGrupa, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowExceptionMaiMic() {
        int nrGrupa = 100;
        Grupa grupa = new Grupa(nrGrupa);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowExceptionMaiMare() {
        int nrGrupa = 2100;
        Grupa grupa = new Grupa(nrGrupa);
    }

    @Test(timeout = 500)
    public void testConstructorPerformance() {
        int nrGrupa = 1077;
        Grupa grupa = new Grupa(nrGrupa);
    }

    //correct
    // conformance - testul constructorRight
    // ordering - nu conteaza ordinea din lista
    // range - boundary(valori limita ale intervalului) + right(valori din interval) + ErrorCondition (inafara intervalului)
    // reference - nu se aplica (trebuie sa avem ceva extern)
    // existence - verific daca lista a fost alocata
    // cardinality - verific lista nenula, verific ca nu are elemente
    // time - acelasi principiu ca la performance

    @Test
    public void testConstructorExistence(){
        int nrGrupa = 1077;
        Grupa grupa = new Grupa(nrGrupa);
        assertNotNull(grupa.getStudenti());
    }



}