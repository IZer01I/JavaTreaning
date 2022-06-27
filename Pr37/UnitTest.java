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
        Main.numberEdit(5);
        assertEquals("Edited number: 10\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.numberEdit(0);
        assertEquals("Edited number: 0\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.numberEdit(-6);
        assertEquals("Edited number: -5\n", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.numberEdit(Integer.parseInt("g"));
        assertEquals("", outContent.toString());}
}