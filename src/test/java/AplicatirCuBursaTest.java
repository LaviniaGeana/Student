import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ulbs.proiectaresoftware.students.AplicatieCuBursa;
import ro.ulbs.proiectaresoftware.students.StudentBursieri;

import java.util.List;

public class AplicatirCuBursaTest
{
    private AplicatieCuBursa test;

    @BeforeEach
    public void setUp()
    {
        test = new AplicatieCuBursa();

    }
    @Test
    public void TestSortare()
    {
        List<StudentBursieri> lista=test.genereaza();
        List<StudentBursieri> listaSoratta=test.sorteaza(lista);

        Assertions.assertEquals(lista,listaSoratta);
    }
}
