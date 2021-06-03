package teste;

import clase.Grupa;
import clase.IStudent;
import org.junit.Test;
import teste.dubluri.StudentStub;

import static org.junit.Assert.*;

public class GrupaTestWithStudentStub {

    @Test
    public void testGetPromovabilitate() {
        IStudent student = new StudentStub();
        Grupa grupa = new Grupa(1077);
        grupa.adaugaStudent(student);
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

}