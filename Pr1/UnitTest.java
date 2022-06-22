import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void shouldReturnCorrectValue() {
        assertEquals(1, Main.getMetreFromCentimetre(100), 0);
    }

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(0, Main.getMetreFromCentimetre(0), 0);
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals(1, Main.getMetreFromCentimetre(105), 0);
    }
}
