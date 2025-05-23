import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCalculatrice {

    private Calculatrice calc;

    @BeforeEach
    void setUp()
    {
        calc = new Calculatrice();
    }

    @Test
    void testAdd() {
        float result = calc.add(6.0f, 4.0f);
        assertEquals(10.0f, result, 1e-6, "L'addition de 6 + 4 doit être 10");
    }

    @Test
    void testDiv() {
        float result = calc.div(10.0f, 5.0f);
        assertEquals(2.0f, result, 1e-6, "La division de 10 par 5 doit être 2");
    }

    @Test
    void testMult(){
        float result = calc.mult(2.0f, 3.0f);
        assertEquals(6.0f, result, 1e-6, "La multiplication de 2 par 3 doit être 6");
    }

    @Test
    void testDivParZero(){
        assertThrows(ArithmeticException.class, () -> {
            calc.div(10.0f, 0.0f);
        }, "Division par zéro doit lancer une ArithmeticException");
    }

    @Test
    void testMinus()
    {
        float result = calc.minus(2.0f, 1.0f);
        assertEquals(1.0f, result, 1e-6, "La soustraction de 2 par 1 doit être 1");
    }
}
