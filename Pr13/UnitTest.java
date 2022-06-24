

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
        Main.writeToConsole("Bebra");
        assertEquals("printing: Bebra\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.writeToConsole("1999, -1,1");
        assertEquals("printing: 1999, -1,1\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.writeToConsole("Hello");
        assertEquals("printing: Hello\n", outContent.toString());}
}