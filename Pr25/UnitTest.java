import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class UnitTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void FirstTest() {
        Main.Money(1);
        assertEquals("I will earn $1 per hour", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.Money(0);
        assertEquals("I will earn $0 per hour", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.Money(-1);
        assertEquals("I will earn $-1 per hour", outContent.toString());
    }

    @Test(expected = NumberFormatException.class)
    public void fourthTest() {
        Main.Money(Integer.parseInt("x"));
        assertEquals("", outContent.toString());
    }
}