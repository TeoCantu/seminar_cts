package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTestWithStudentDummy.class, GrupaTestWithStudentFake.class,
        GrupaTestWithStudentStub.class, TestGrupa.class, GrupaTestCuFixture.class})
public class SuitaCompleta {
}
