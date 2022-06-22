import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void shouldReturnCorrectValue() { assertEquals("50.0", Main.convertEurToUsd(Main.test1, 10));}

    @Test
    public void shouldReturnZeroValue() {
        assertEquals("you need to enter an amount greater than 0", Main.convertEurToUsd(Main.test2, 10));
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals("5.0", Main.convertEurToUsd(Main.test3, 10));
    }
}
