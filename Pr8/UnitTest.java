

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
        Main.Birthday(2007, 1,1);
        assertEquals("My birthday Mon Jan 01 00:00:00 MSK 2007\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.Birthday(1999, -1,1);
        assertEquals("date of birth cannot be negative or equal to 0!\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.Birthday(0, 1,1);
        assertEquals("date of birth cannot be negative or equal to 0!\n", outContent.toString());}
}