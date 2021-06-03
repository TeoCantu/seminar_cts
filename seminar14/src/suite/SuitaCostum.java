package suite;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.*;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestGrupa.class, GrupaTestWithStudentStub.class, GrupaTestWithStudentFake.class,
        GrupaTestWithStudentDummy.class, GrupaTestCuFixture.class})
@Categories.IncludeCategory({TesteGetPromovabilitate.class})
@Categories.ExcludeCategory({TesteNormale.class, TesteUrgente.class})
public class SuitaCostum {
}
