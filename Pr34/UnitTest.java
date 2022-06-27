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
        Main.closeToTen(0, 1);
        assertEquals("1\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.closeToTen(5, 2);
        assertEquals("5\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.closeToTen(1, 19);
        assertEquals("1 19\n", outContent.toString());}
}