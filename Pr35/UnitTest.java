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
        Main.getInterval(0);
        assertEquals("The number 0 is not contained in the interval\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.getInterval(66);
        assertEquals("The number 66 contained in the interval\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.getInterval(101);
        assertEquals("The number 101 is not contained in the interval\n", outContent.toString());}
}