import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void shouldReturnCorrectValue() { assertEquals(5.5, Main.tenPercent(Main.test1));}

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(-11.0, Main.tenPercent(Main.test2));
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals(0.0, Main.tenPercent(Main.test3));
    }
}
