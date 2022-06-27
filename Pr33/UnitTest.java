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
        Main.compare(0);
        assertEquals("number less than 5\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.compare(5);
        assertEquals("number is 5\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.compare(7);
        assertEquals("number greater than 5\n", outContent.toString());}
}