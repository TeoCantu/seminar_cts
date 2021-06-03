package teste;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class GrupaTestCuFixture {
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
    @Category({TesteGetPromovabilitate.class})
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
    @Category({TesteGetPromovabilitate.class})
    public void testGetPromovabilitateLowerBoundary() {
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    //performance
    @Test(timeout = 500)
    @Category({TesteGetPromovabilitate.class})
    public void testGetPromovabilitatePerformance() {
        grupa.getPromovabilitate();
    }

}