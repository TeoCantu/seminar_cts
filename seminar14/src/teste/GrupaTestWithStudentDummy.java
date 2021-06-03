package teste;

import clase.Grupa;
import clase.IStudent;
import org.junit.Test;
import teste.dubluri.StudentDummy;

import static org.junit.Assert.*;

public class GrupaTestWithStudentDummy {

    @Test
    public void testAdaugaStudent() {
        IStudent student = new StudentDummy();
        Grupa grupa = new Grupa(1077);
        grupa.adaugaStudent(student);
        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void testAdaugaStudenti() {
        Grupa grupa =new Grupa(1010);
        IStudent student1 = new StudentDummy();
        IStudent student2 = new StudentDummy();

        grupa.adaugaStudent(student1);
        grupa.adaugaStudent(student2);
        assertEquals(2, grupa.getStudenti().size());
    }

}