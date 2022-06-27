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
        Main.min(1,2);
        assertEquals("min: 1.0\n", outContent.toString());
    }

    @Test
    public void SecondTest() {
        Main.min(7,4);
        assertEquals("min: 4.0\n", outContent.toString());
    }

    @Test
    public void ThirdTest() {
        Main.min(1,1);
        assertEquals("1.0\n", outContent.toString());}

    @Test(expected = NumberFormatException.class)
    public void FourthTest() {
        Main.min(Double.parseDouble("g"), 1);
        assertEquals("", outContent.toString());}
}