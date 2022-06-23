import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class UnitTest {

    @Test(expected = ArithmeticException.class)
    public void ArithmeticExceptionValue() {
        assertEquals("pool volume cannot be less than or equal to 0", Main.getVolume(1, 2, -5));
    }

    @Test(expected = ArithmeticException.class)
    public void ArithmeticExceptionZeroValue() {
        assertEquals("pool volume cannot be less than or equal to 0", Main.getVolume(100, 5, 0));
    }

    @Test
    public void shouldReturnIntValue() {
        assertEquals(6000, Main.getVolume(1, 2, 3));
    }
}
