package teste;

import clase.Grupa;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGrupa {

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