
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStatistique{

    @Test
    public void testMoyenne(){

        Statistique stat = new Statistique();

        float resultat = stat.moyenne(4, 6);
        assertEquals(5.0f, resultat, 0.001);
        assertEquals(2.5f, stat.moyenne(0, 5), 0.001);
        assertEquals(0.0f, stat.moyenne(-3, 3), 0.001);
    }
}
