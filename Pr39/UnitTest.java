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
        Main.yearInfo(5);
        assertEquals("Number of days in a year: 365\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.yearInfo(400);
        assertEquals("Number of days in a year: 366\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.yearInfo(-1);
        assertEquals("Negative year?\n", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.yearInfo(Integer.parseInt("g"));
        assertEquals("", outContent.toString());}
}