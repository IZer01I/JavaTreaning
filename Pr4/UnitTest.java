import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest
{
    @Test
    public void shouldReturnCorrectValue() { assertEquals("pool volume cannot be less than or equal to 0", Main.getVolume(1, -5, 5));}

    @Test
    public void shouldReturnZeroValue() { assertEquals("pool volume cannot be less than or equal to 0", Main.getVolume(100, 5, 0));
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals("pool volume: 6000.0", Main.getVolume(1, 2, 3));
    }
}
