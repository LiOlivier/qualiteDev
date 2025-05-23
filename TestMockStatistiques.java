///EXERCICE 2 MOCKITO STATISTIQUE
///
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class TestMockitoStatistique {

    @Test
    void testMoyenneAvecMock(){
        Calculatrice mockCalc = mock(Calculatrice.class);

        when(mockCalc.add(4.0f, 6.0f)).thenReturn(10.0f);
        when(mockCalc.div(10.0f, 2.0f)).thenReturn(5.0f);

        Statistique stat = new Statistique(mockCalc);
        float moyenne = stat.moyenne(4.0f, 6.0f);

        assertEquals(5.0f, moyenne);
        verify(mockCalc).add(4.0f, 6.0f);
        verify(mockCalc).div(10.0f, 2.0f);
    }
}
