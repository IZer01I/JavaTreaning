import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    @Test
    public void shouldReturnCorrectValue() { assertEquals(Main.str1, Main.GetStr("Bebra"));}

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(Main.str2, Main.GetStr("Hello"));
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals(Main.str3, Main.GetStr("Go to the cinema"));
    }
}
