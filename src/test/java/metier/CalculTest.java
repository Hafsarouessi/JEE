package metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculTest {
    private Calcul calcul = new Calcul();

    @Test
    void testSomme() {
        double a = 5, b = 9;
        double expected = 14;
        double res = calcul.somme(a, b);
        assertEquals(expected, res, "La somme des deux nombres devrait être correcte.");
    }
}
