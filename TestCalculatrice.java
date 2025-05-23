
import org.junit.api.BeforeEach;
import org.junit.api.Test;
import org.junit.api.Throws;
public class TestCalculatrice throw Exception {

    private Calculatrice calc;

    /// QUESTION 1 ECRIRE CALCULATRICE SOUS FORME DE JUNIT;
    @BeforeEach
    void setUp(){
        calc = new Calcultrice();
    }
    @Test
    void testAdd(){
        float operande1 = 6.0f;
        float operande2 = 4.0f;
        float res = calc.add(6.0f, 4.0f);
        AssertEquals(10.0f, res, 1e-6, "l'addition de 6 + 4 égal à 10")
    }
// USAGE DE 1e-6 pour la marge d'erreurs en 1x10-⁶

    @Test
    void testDiv(){
        float numerateur = 10.0f;
        float denominateur = 5.0f;
        float res = (numerateur/denominateur);
        assertEquals(2.0f, res, 1e-6, "Division de 10 par 5 égal à 2");
    }

    @Test
    void testMult(){
        float operande1 = 2.0f;
        float operande2 = 3.0f;
        float res = operande1 * operande2;
        assertEquals(6.0f, res, 1e-6, "Multiplication de 2 par 3 égal 6");
    }

    @Test
    void testDivParZero(){
        float numerateur = 10.0f;
        float denominateur = 0.0;
        float res = (numerateur/denominateur);
        assertThrow(ArithmeticException), () -> calc.div(numerateur/denominateur), "Division par Zero retourne un ArithmeticException";
    }

    // QUESTION 2 TEST méthode minus implémenter dans calcultrice

    @Test
    void testMinus(){
        float operande1 = 2.0f;
        float operande2 = 1.0f;
        float res = operande1 - operande2;
        AssertEquals(1.0f, res, 1e-6, "Soustraction de 2 par 1 égal à 1");
    }
}

public void main() {
}