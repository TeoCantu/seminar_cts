package tests;

import static org.junit.Assert.*;

import clase.Student;
import org.junit.Before;
import org.junit.Test;

public class StudentTest  {
    Student student = null;

    @Before
    public void setup() {
        student = new Student();
    }

    @Test
    public void testApelConstructorCuParametru() {
        String nume = "Ion";
        Student student = new Student(nume);
//        if(nume != student.getNume()) {
//            fail("Numele nu este corect");
//        }
        assertEquals(nume, student.getNume());

    }

    @Test
    public void testApelConstructorFaraParametru() {
        String nume = "Student";
        Student student = new Student();
        assertEquals(nume, student.getNume());
    }

    @Test
    public void testInitializareListaConstructorFaraParametru() {
        assertNotNull(student.getNote());
    }

    @Test
    public void testAdaugareNota() {
        int nota = 9;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @Test
    public void testDimensiuneLista() {
        int nota = 9;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testSetNume() {
        String nume = "Gigel";
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }

    @Test
    public void testCalculMedie() {
        int nota1 = 8;
        int nota2 = 10;
        float medie = (float)(nota1+nota2)/2;
        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        assertEquals(medie, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void testCalculMedieFaraNote() {
        assertEquals(0, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void testCalculMedieONota() {
        int nota = 8;
        student.adaugaNota(nota);
        assertEquals(nota, student.calculeazaMedie(), 0.01);
    }

    @Test
    public void testAreRestante() {
        int nota = 4;
        int nota2 = 9;
        student.adaugaNota(nota);
        student.adaugaNota(nota2);
        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante() {
        int nota1 = 5;
        int nota2 = 10;
        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        assertFalse(student.areRestante());
    }

    @Test
    public void testAreRestanteFaraNote() {
        assertFalse(student.areRestante());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAruncaExceptieIndex() {
        int index = -3;
        student.getNota(index);
    }

    @Test
    public void testAruncaExceptieIndexJUnit3() {
        //1
        try{
            //2
            student.getNota(-1);
            fail("Nu trebuia sa ajunga aici");
        } catch (IndexOutOfBoundsException err) {
            //4
        }
        //5
    }

}