import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest
{
    @Test
    public void shouldReturnCorrectValue() {
        assertEquals(1, Main.sumDigitsInNumber(100), 0);
    }

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(0, Main.sumDigitsInNumber(0), 0);
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals(6, Main.sumDigitsInNumber(105), 0);
    }
}
