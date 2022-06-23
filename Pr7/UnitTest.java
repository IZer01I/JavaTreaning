import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void shouldReturnCorrectValue() { assertEquals(5.5, Main.tenPercent(Main.test1));}

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(-11.0, Main.tenPercent(Main.test2));
    }

    @Test (expected = ArithmeticException.class)
    public void shouldReturnFloatValue() {
        assertEquals("Why do you want to get a percentage of 0?", Main.tenPercent(Main.test3));
    }
}